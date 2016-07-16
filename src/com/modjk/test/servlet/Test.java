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
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.modjk.jbbs.data.Result;
import com.modjk.jbbs.data.ResultMapper;
import com.modjk.jbbs.data.User;
import com.modjk.jbbs.data.UserJDBCTemplate;
import com.modjk.jbbs.data.UserMapper;
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
		
		DataSource ds = (DataSource)Context.lookup("JNK");
		
		UserJDBCTemplate userJDBCTemplate = new UserJDBCTemplate();
		userJDBCTemplate.setDataSource(ds);
		
		
		ObjectMapper mapper = new XmlMapper();
		
		// 테스트
		
		
		User user = new User();
		user.name = "test";
		user.comment = "test_comment";
		String xml = mapper.writeValueAsString(new User());
	
		
//		ObjectMapper xmlMapper = new XmlMapper();
//		Simple value = xmlMapper.readValue("<Simple><x>1</x><y>2</y></Simple>", Simple.class);
		
		logger.debug(xml);
		
//		Long userId = userJDBCTemplate.create("abcd", "123123", "name", "test@address.com", "comment");
//		
//		{
//			
//			User user = userJDBCTemplate.get(userId);
//			
//			
//			logger.debug(  user.name + " " + user.email );
//				
//		}
		
//		{
//			User user = userJDBCTemplate.login("test", "321");
//			System.out.println(user);
//		}
		
		
		
//		List<User> list = userJDBCTemplate.list();
//		
//		for( User u : list )
//		{
//			logger.debug( u.name );
//			logger.debug(  Mapper.toJSONObject(u).toString() ) ;
//		}
		
//		User user = jdbcTemplateObject.queryForObject("SELECT * FROM [dbo].[jnk_user] WHERE user_id = ? ",new Object[]{1},  new UserMapper());
//		
//		
//		//logger.debug(  "" + students.size() );
//		logger.debug( user.name );
//		logger.debug(  Mapper.toJSONObject(user).toString() ) ;
//		
//		logger.debug( "-------------------");
//		
//		{
//			List<User> user1 = jdbcTemplateObject.query("SELECT * FROM [dbo].[jnk_user] ", new UserMapper());
//			for( User u : user1 )
//			{
//				logger.debug( u.name );
//				logger.debug(  Mapper.toJSONObject(u).toString() ) ;
//			}
//		}


		
		// out.append("Served at: ").append(request.getContextPath());
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
