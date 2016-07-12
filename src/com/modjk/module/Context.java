package com.modjk.module;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Context
 * 
 * @author		Jung Seong Hun (gemzone@naver.com)
 * @version	1.0
 */
public class Context 
{
	public static final Logger logger = LoggerFactory.getLogger(Context.class);
	
	public static Object lookup(String contextResourceName)
	{
		try 
		{
			return (Object)new InitialContext().lookup("java:comp/env/" + contextResourceName);
		}
		catch (NamingException e) 
		{
			logger.debug(e.getMessage());
			return null;
		}
	}
	
	public static String getParameter(HttpServletRequest request, String contextParameterName )
	{
		try 
		{
			return request.getServletContext().getInitParameter( contextParameterName );
		}
		catch (Exception e)
		{
			logger.debug(e.getMessage());
			return null;
		}
	}
}
