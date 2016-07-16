package com.modjk.module;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;

/**
 * Parameter
 *
 * @see
 * 
 * @author		Jung Seong Hun
 * @version	2.0
 */
public class Param
{
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(Param.class);
	
	private Map<String, String[]> parameters = null;
	public HashMap<String, Object> data = null;
	
	String currentKey = ""; 
	
	private HttpServletRequest request = null;
	
	public Param( HttpServletRequest request ) 
	{
		this.request = request;
		try
		{
			this.request.setCharacterEncoding("utf-8");
		} 
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
		parameters = this.request.getParameterMap();
		
		logger.debug( "RequestParam data: " + parameters.toString() );
		
		if(parameters == null)
		{
			data = null;
		}
		else
		{
			data = new HashMap<String, Object>();
		}
		
		for(String key : parameters.keySet())
		{
			String valueList[] = parameters.get(key);
			String value = "";
			
			for(int i = 0; i < valueList.length; i ++)
			{
				if( i == 0 )
				{
					if(valueList[i] == null) { continue; }
					else { value = valueList[i]; }
				}
				else
				{
					if(valueList[i] == null) { continue; }
					else { value += "," + valueList[i]; }
				}
			}
			data.put(key, value);
		}
	}
	
	public Param( JSONObject d )	// JSON To Map
	{
		this.data = new HashMap<String , Object>();
		Iterator<?> iter = d.keys();
		while(iter.hasNext() )
		{
			String key = (String)iter.next();
			try
			{
				this.data.put(key, d.get(key));
			}
			catch (JSONException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public Param add(String name, String value)
	{
		this.data.put(name, value);
		return this;
	}
	
	public Object getObject(String parameterName)
	{
		Object parameterValue = data.get(parameterName);
		if(parameterValue == null)
		{
			logger.debug("Parameter not found::getObject: " + parameterName);
			return null;
		}
		else
		{
			return parameterValue;	
		}
	}
	
	public byte getByte(String parameterName)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getByte: " + parameterName);
			return ((byte)0);
		}
		else
		{
			try
			{
			return Byte.parseByte( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return ((byte)0);
			}
		}
	}
	
	public short getShort(String parameterName)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getShort: " + parameterName);
			return ((short)0);
		}
		else
		{
			try
			{
			return Short.parseShort( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return ((short)0);
			}
		}
	}
	
	public Integer getInteger(String parameterName)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getInteger: " + parameterName);
			return 0;
		}
		else
		{
			try
			{
			return Integer.parseInt( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return 0;
			}
		}
	}
	
	public int getInt(String parameterName)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getInt: " + parameterName);
			return 0;
		}
		else
		{
			try
			{
			return Integer.parseInt( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return 0;
			}
		}
	}
	
	public Long getLong(String parameterName, Long defaultValue)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getLong: " + parameterName);
			return defaultValue;
		}
		else
		{
			try
			{	
				return Long.parseLong( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return defaultValue;
			}
		}
	}

	public Long getLong(String parameterName)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getLong: " + parameterName);
			return (long)0;
		}
		else
		{
			try
			{
			return Long.parseLong( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return (long)0;
			}
		}
	}
	public Integer getInteger(String parameterName, Integer defaultValue)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getInteger: " + parameterName);
			return defaultValue;
		}
		else
		{
			try
			{	
				return Integer.parseInt( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return defaultValue;
			}
		}
	}
	
	public int getInt(String parameterName, int defaultValue)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("RequestParam is null::getInt: " + parameterName);
			return defaultValue;
		}
		else
		{
			try
			{	
				return Integer.parseInt( data.get(parameterName).toString() );
			}
			catch(Exception e)
			{
				return defaultValue;
			}
		}
	}
	
//	public String getServletContext(String name)
//	{
//		if( name != null && !"".equals(name))
//		{
//			return this.req.getServletContext().getInitParameter(name);
//		}
//		else
//		{
//			return "";
//		}
//	}

	public String getString(String parameterName)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("Parameter not found::getString: " + parameterName);
			return "";
		}
		else
		{
			return data.get(parameterName).toString();
		}
	}
	
	public String getString(String parameterName, String defaultValue)
	{
		if(data.get(parameterName) == null)
		{
			logger.debug("Parameter not found::getString: " + parameterName);
			return defaultValue;
		}
		else
		{
			return data.get(parameterName).toString();
		}
	}
	
	public boolean getBoolean(String parameterName, boolean defaultValue)
	{
		if (data.get(parameterName) == null)
		{
			logger.debug("Parameter not found::getString: " + parameterName);
			return defaultValue;
		}
		else
		{
			try
			{
				return Boolean.parseBoolean(data.get(parameterName).toString());
			}
			catch (Exception e)
			{
				return defaultValue;
			}
		}
	}
	
	public String getKey()
	{
		return currentKey;
	}
	public Object getValue()
	{
		return data.get(currentKey);
	}
	public String getValueToString()
	{
		return data.get(currentKey).toString();
	}
	public Object getValueToInteger()
	{
		return data.get(currentKey);
	}

}