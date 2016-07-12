package com.modjk.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.modjk.module.Context;
import com.modjk.module.mapping.ResultSetMapper;

@WebServlet("/Test")
public class Test extends HttpServlet
{
	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	private static final long serialVersionUID = 1L;
	
	public class User
	{
		 public int user_id; 
		 public int group_id; 
		 public String id; 
		 public String name; 
		 public String email; 
		 public short level; 
		 public int point;
		 public String comment;
		 public boolean is_superadmin;
		 public String register_time;
	}
	
	
	public class UserMapper implements RowMapper<User> 
	{
		   public User mapRow(ResultSet rs, int rowNum) throws SQLException 
		   {
			   ResultSetMapper<User> mapper = new ResultSetMapper<>();
			   ArrayList<User> user = mapper.mapRersultSetToObject(rs, User.class, null);
			   
			   //User user = new User();
			   
//			   user.
//			   user.setId(rs.getInt("id"));
//			   user.setName(rs.getString("name"));
//			   user.setAge(rs.getInt("age"));
			   return user;
		   }
	}
	
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
		
		List<User> students = jdbcTemplateObject.query("SELECT * FROM [dbo].[jnk_user]", new UserMapper());
		
		for( User u : students)
		{
			logger.debug( u.name );
		}
		
		
		out.print("ㅇㅅasdfasdfasdfffffffffffffffffasdfasdㅇasdasdㅅ");
		
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
