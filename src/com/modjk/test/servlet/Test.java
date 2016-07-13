package com.modjk.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.modjk.jbbs.data.User;
import com.modjk.jbbs.data.mapping.UserMapper;
import com.modjk.module.Context;
import com.modjk.module.mapping.Column;
import com.modjk.module.mapping.Entity;
import com.modjk.module.mapping.Mapper;
import com.modjk.module.mapping.ResultSetMapper;

@WebServlet("/Test")
public class Test extends HttpServlet
{
	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
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
		
		DataSource dataSource = (DataSource)Context.lookup("JNK");
		JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
		
		// List<User> students = jdbcTemplateObject.query("SELECT * FROM [dbo].[jnk_user]", new UserMapper());

		User user = jdbcTemplateObject.queryForObject("SELECT * FROM [dbo].[jnk_user] WHERE user_id = ? ",new Object[]{1},  new UserMapper());
		
		
		//logger.debug(  "" + students.size() );
		logger.debug( user.name );
		logger.debug(  Mapper.toJSONObject(user).toString() ) ;
		
		logger.debug( "-------------------");
		
		{
			List<User> user1 = jdbcTemplateObject.query("SELECT * FROM [dbo].[jnk_user] ", new UserMapper());
			for( User u : user1 )
			{
				logger.debug( u.name );
				logger.debug(  Mapper.toJSONObject(u).toString() ) ;
			}
		}

		
		out.print("ㅇㅅasdfasdfasdfffffffffffffffffasdfasdㅇasdasdㅅ" + user.name);
		
		out.append("Served at: ").append(request.getContextPath());
		
		
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
