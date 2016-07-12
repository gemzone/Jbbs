<%@

	page language="java" contentType="text/html" pageEncoding="utf-8" 
	
%><%


	Object userId = request.getSession().getAttribute("user_id");


	if( userId != null ) 
	{
		if( Integer.parseInt(userId.toString()) > 0 )
		{
			response.sendRedirect("./main.xml");
		}
		else
		{
			response.sendRedirect("./login.xml");
		}
	}
	else
	{
		response.sendRedirect("./login.xml");
	}
%>