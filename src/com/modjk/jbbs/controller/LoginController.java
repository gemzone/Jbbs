package com.modjk.jbbs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.modjk.jbbs.data.User;
import com.modjk.jbbs.data.UserJDBCTemplate;
import com.modjk.module.Context;
import com.modjk.module.Param;
import com.modjk.module.mapping.Mapper;
import com.modjk.test.servlet.Test;

@WebServlet("/login.do")
public class LoginController extends HttpServlet
{
	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
//		response.setHeader("Expires", "Tue, 03 Jul 2001 06:00:00 GMT");	// Proxies
//		response.setHeader("Last-Modified", new Date().toString());
//		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0, post-check=0, pre-check=0");	// HTTP 1.1
//		response.setHeader("Pragma", "no-cache");	// HTTP 1.0
		
		// text/html
		// application/json
		// text/xml
		// text/plain
		response.setContentType("application/json");
		JSONObject json = new JSONObject();
		
		out.print(json.toString());
	}

	/**
	 * 로그인 처리 부분
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String contentType = request.getHeader("content-type"); 
		HttpSession session = request.getSession();
		Integer userId = (Integer)session.getAttribute("user_id");
		
		Param param = new Param(request);

		String id = param.getString("id");
		String password = param.getString("password");
		
		DataSource ds = (DataSource)Context.lookup("JNK");
		UserJDBCTemplate userJDBCTemplate = new UserJDBCTemplate();
		userJDBCTemplate.setDataSource(ds);
		
		
		User user = userJDBCTemplate.login(id, password);
		
		if( user == null ) 
		{
			user = new User();
			user.error = 1;
			user.reason = "login_failed";
		}
		
		
		if( "application/xml".contentEquals( contentType ) || "text/xml".contentEquals( contentType ) )	// xml 아니면
		{
			response.setContentType("text/xml");
			
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
			StringWriter sw = new StringWriter();
			XMLStreamWriter xsw = null;
			XmlMapper xmlMapper = new XmlMapper(xmlInputFactory);
			
			try
			{
				xsw = xmlOutputFactory.createXMLStreamWriter(sw);
				xsw.writeStartDocument();
				
				xmlMapper.writeValue(xsw, user);
				
				xsw.writeEndDocument();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			
			out.print(sw.toString());
		}
		else
		{
			response.setContentType("application/json");
			
			JSONObject json = new JSONObject();
			
			json = Mapper.toJSONObject(user);
			
			out.print(json.toString());
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		
		out.print(json.toString());
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		
		out.print(json.toString());
	}
	
	

	
	
//	logger.debug( "Content-Type : " +  request.getHeader("Content-Type")  ) ;
//
//	logger.debug( "content-type : " +  request.getHeader("content-type")  ) ;
//
//	Map<String, String> map = new HashMap<String, String>();
//
//	Enumeration headerNames = request.getHeaderNames();
//	while (headerNames.hasMoreElements()) {
//		String key = (String) headerNames.nextElement();
//		String value = request.getHeader(key);
//		map.put(key, value);
//		
//		logger.debug(key + " : " + value);
//	}

	
}
