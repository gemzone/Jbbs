package com.modjk.module.jdbc;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class JdbcTest
{
	// private static final Logger logger = LoggerFactory.getLogger(JdbcTest.class);
	
	// ------------------------------------------------------------------------------------
	/*
	ArrayList<Object> result = new ArrayList<>();
	
	try(Connection connection = ((DataSource)Context.lookup("JNK")).getConnection();
		CallableStatement cstmt = connection.prepareCall("{ CALL [dbo].[GetUserList] () }");
		ResultSet rs = cstmt.executeQuery();)
	{
		// 프로시저 방식
		{
			ResultSetMetaData rsmd = null;
			HashMap<String, Object> dm = null;
			while(rs.next())
			{
				logger.debug("loop");
				rsmd = rs.getMetaData();
				dm = new HashMap<String, Object>();
				for(int i = 1 ; i <= rsmd.getColumnCount() ; i++)
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
						dm.put(rsmd.getColumnName(i).toString(), rs.getString(i));
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
				
				if( dm != null ) 
				{
					logger.debug( dm.toString() );
					result.add(dm);
				}
				
			}
			
		}
		
	
		// 쿼리 방식
//		{
//			PreparedStatement pstmt = null;
//			ResultSet rs = null;
//			ResultSetMetaData rsmd = null;
//			pstmt = connection.prepareStatement("SELECT * FROM [dbo].[jnk].[user]");
//			
//			rs = pstmt.executeQuery();
//			
//		}
		
		
		
	}
	catch (SQLException e)
	{
		logger.error(e.getMessage());
	}
	*/
	
	
	
	
}
