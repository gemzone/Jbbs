package com.modjk.jbbs.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Servlet implementation class List2
 */
@WebServlet("/register")
public class RegisterView extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterView()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
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
		response.setContentType("text/xml");
		
		XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
		StringWriter sw = new StringWriter();
		XMLStreamWriter xsw = null;
		@SuppressWarnings("unused")
		XmlMapper mapper = new XmlMapper(xmlInputFactory);
		
		try
		{
			xsw = xmlOutputFactory.createXMLStreamWriter(sw);
			xsw.writeStartDocument();
			xsw.writeProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"register.xsl\"");
			xsw.writeStartElement("jbbs");

			xsw.writeEndElement();
			xsw.writeEndDocument();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		out.print(sw.toString());
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
