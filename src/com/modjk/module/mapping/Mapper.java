package com.modjk.module.mapping;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper
{
	private static final Logger logger = LoggerFactory.getLogger(Mapper.class);
	
	public static HashMap<String, Object> ToHashMap(Object o)
	{
		HashMap<String, Object> result = new HashMap<>();

		@SuppressWarnings("rawtypes")
		Class clazz = o.getClass();

		Field[] fields = clazz.getFields();
		for (Field field : fields)
		{
			try
			{
				result.put(field.getName(), field.get(o));
			} catch (IllegalArgumentException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	public static JSONObject toJSONObject(Object o)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			String jsonValue = mapper.writeValueAsString(o);
			return new JSONObject(jsonValue);
		} catch (Exception e)
		{
			StackTraceElement[] ste = e.getStackTrace();
			String className = ste[0].getClassName();
			String methodName = ste[0].getMethodName();
			String fileName = ste[0].getFileName();
			int lineNumber = ste[0].getLineNumber();
			logger.error("Exception: {}", e.getMessage());
			logger.error("{}.{} File:{}, Line:{}", new Object[] { className, methodName, fileName, lineNumber });
			return new JSONObject();
		}
	}

	public static JSONArray toJSONArray(Collection<?> o)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			String jsonValue = mapper.writeValueAsString(o);
			return new JSONArray(jsonValue);
		} catch (Exception e)
		{
			StackTraceElement[] ste = e.getStackTrace();
			String className = ste[0].getClassName();
			String methodName = ste[0].getMethodName();
			String fileName = ste[0].getFileName();
			int lineNumber = ste[0].getLineNumber();
			logger.error("Exception: {}", e.getMessage());
			logger.error("{}.{} File:{}, Line:{}", new Object[] { className, methodName, fileName, lineNumber });
			return new JSONArray();
		}
	}

	public static <T> T toClass(String json, Class<T> clazz)
	{
		ObjectMapper mapper = new ObjectMapper();
		T t = null;
		try
		{
			t = mapper.readValue(json, clazz);
		} catch (JsonParseException e)
		{
			StackTraceElement[] ste = e.getStackTrace();
			String className = ste[0].getClassName();
			String methodName = ste[0].getMethodName();
			String fileName = ste[0].getFileName();
			int lineNumber = ste[0].getLineNumber();
			logger.error("Exception: {}", e.getMessage());
			logger.error("{}.{} File:{}, Line:{}", new Object[] { className, methodName, fileName, lineNumber });
		} catch (JsonMappingException e)
		{
			StackTraceElement[] ste = e.getStackTrace();
			String className = ste[0].getClassName();
			String methodName = ste[0].getMethodName();
			String fileName = ste[0].getFileName();
			int lineNumber = ste[0].getLineNumber();
			logger.error("Exception: {}", e.getMessage());
			logger.error("{}.{} File:{}, Line:{}", new Object[] { className, methodName, fileName, lineNumber });
		} catch (IOException e)
		{
			StackTraceElement[] ste = e.getStackTrace();
			String className = ste[0].getClassName();
			String methodName = ste[0].getMethodName();
			String fileName = ste[0].getFileName();
			int lineNumber = ste[0].getLineNumber();
			logger.error("Exception: {}", e.getMessage());
			logger.error("{}.{} File:{}, Line:{}", new Object[] { className, methodName, fileName, lineNumber });
		}

		return t;
	}
	
}
