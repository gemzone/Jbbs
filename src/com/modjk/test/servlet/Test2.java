package com.modjk.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.modjk.module.Context;

@WebServlet("/Test2")
public class Test2 extends HttpServlet
{
	private static final Logger logger = LoggerFactory.getLogger(Test2.class);
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		// no cache
		response.setHeader("Expires", "Tue, 03 Jul 2001 06:00:00 GMT");	// Proxies
		response.setHeader("Last-Modified", new Date().toString());
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0, post-check=0, pre-check=0");	// HTTP 1.1
		response.setHeader("Pragma", "no-cache");	// HTTP 1.0
	
		// text/html
		// application/json
		// text/xml
		// text/plain
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// ------------------------------------------------------------------------------------

		while(true) {
			
		try
		{
			Thread.sleep(1);

			try(Connection connection = ((DataSource)Context.lookup("JNK")).getConnection();
				CallableStatement cstmt = connection.prepareCall("{ CALL [dbo].[GetUserList] () }");
				ResultSet rs = cstmt.executeQuery();)
			{
				// 프로시저 방식
				{
					boolean nullable = true;
					ResultSetMetaData rsmd = null;
					while(rs.next())
					{
						logger.debug("loop");
						rsmd = rs.getMetaData();
						HashMap<String, Object> dm = new HashMap<String, Object>();
						for(int i = 1 ; i <= rsmd.getColumnCount() ; i++)
						{
							if( nullable )
							{
								if (rs.getObject(i) instanceof Integer) {
									dm.put(rsmd.getColumnName(i).toString(), rs.getInt(i));
								}
								else if (rs.getObject(i) instanceof Long)
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getLong(i));
								}
								else if (rs.getObject(i) instanceof Boolean)	
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getBoolean(i));
								}
								else
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
								}
							}
							else
							{
								if( rsmd.getColumnType(i) == java.sql.Types.BIGINT)
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getLong(i));
								}
								else if( rsmd.getColumnType(i) == java.sql.Types.INTEGER || 
										  rsmd.getColumnType(i) == java.sql.Types.TINYINT || 
										  rsmd.getColumnType(i) == java.sql.Types.SMALLINT )
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getInt(i));
								}
								else if( rsmd.getColumnType(i) == java.sql.Types.NVARCHAR)
								{
									try
									{
										if( rs.getObject(i) == null)
										{
											dm.put(rsmd.getColumnName(i).toString(), "");
										}
										else
										{
											dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
										}
									}
									catch(Exception e)
									{
										logger.error(e.getMessage());
										dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
									}
								}
								else if( rsmd.getColumnType(i) == java.sql.Types.BIT)
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getBoolean(i));
								}
								else if( rsmd.getColumnType(i) == java.sql.Types.DOUBLE)
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getDouble(i));
								}
								else if( rsmd.getColumnType(i) == java.sql.Types.FLOAT)
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getFloat(i));
								}
								else if( rsmd.getColumnType(i) == java.sql.Types.DATE || 
										  rsmd.getColumnType(i) == java.sql.Types.TIME || 
										  rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP )
								{
									// 2013-09-24
									// Java에서 MSSQL과 데이터타입 호환시 DATE와 TIME과는 다르다. 
									// TIMESTAMP가 MSSQL의 DATETIME과 호환된다
									try
									{
										if( rs.getObject(i) == null )
										{
											dm.put(rsmd.getColumnName(i).toString(), "");
										}
										else
										{
											dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
										}
									}
									catch(Exception e)
									{
										logger.error(e.getMessage());
										dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
									}
								}
								else
								{
									dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
								}
							}
						}
					}
					
				}
				
				// 쿼리 방식
//				{
//					PreparedStatement pstmt = null;
//					ResultSet rs = null;
//					ResultSetMetaData rsmd = null;
//					pstmt = connection.prepareStatement("SELECT * FROM [dbo].[jnk].[user]");
//					
//					rs = pstmt.executeQuery();
//					
//				}
				
				
				
			}
			catch (SQLException e1)
			{
				logger.error(e1.getMessage());
			}
			
			// 쿼리 방식
//			{
//				PreparedStatement pstmt = null;
//				ResultSet rs = null;
//				ResultSetMetaData rsmd = null;
//				pstmt = connection.prepareStatement("SELECT * FROM [dbo].[jnk].[user]");
//				
//				rs = pstmt.executeQuery();
//				
//			}
//			
			
			
			
			
			
		}catch (InterruptedException e1)
		{
			logger.error(e1.getMessage());
		}
		
		
		

		}
		
		
		
		
		
		
		// ------------------------------------------------------------------------------------
		
		
		
//		
//		
//		out.print("ㅇㅅasdfasdfasdfffffffffffffffffasdfasdㅇasdasdㅅ");
//		
//		out.append("Served at: ").append(request.getContextPath());
//		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
//	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		// TODO Auto-generated method stub
//	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
//	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException
//	{
//		// TODO Auto-generated method stub
//	}

}
