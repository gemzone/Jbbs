package com.modjk.jbbs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.json.JSONObject;
import com.modjk.jbbs.data.UserJDBCTemplate;
import com.modjk.module.Context;

@WebServlet("/login.do")
public class LoginController extends HttpServlet
{
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
		JSONObject json = new JSONObject();
		
		
//		HttpSession session = request.getSession();
//		 (Object)session.getAttribute("user_id");
//		
//		
//		
//		DataSource ds = (DataSource)Context.lookup("JNK");
//		UserJDBCTemplate userJDBCTemplate = new UserJDBCTemplate();
//		userJDBCTemplate.setDataSource(ds);
//		
//		
//		
//		userJDBCTemplate.login(userId, password);
//		
//		
//		
		
		
		
		
		
		out.print(json.toString());
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
}
