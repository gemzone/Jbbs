package com.modjk.module.mapping;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultSetMapper<T>
{
	public static final Logger logger = LoggerFactory.getLogger(ResultSetMapper.class);
	
	@FunctionalInterface
	public interface RowItemFinishCallback<T>
	{
		public void call(T item);
	}
	
	// This method is already implemented in package 
	// but as far as I know it accepts only public class attributes
	private void setProperty(Object clazz, Field field, int columnType, Object columnValue)
	{
		try
		{
			// get all fields of the class (including public/protected/private)
			// this is necessary in case the field visibility is set at private
			field.setAccessible(true);
			
			switch (columnType)
			{
			case java.sql.Types.TIMESTAMP:
				{
					if (columnValue != null)
					{
						field.set(clazz, String.valueOf(columnValue));
					}
					else
					{
						field.set(clazz, null);
					}
				}
				break;
			case java.sql.Types.DOUBLE:
				{
					if (columnValue != null)
					{
						if (field.getType() == float.class)
						{
							field.set(clazz, ((java.lang.Double) columnValue).floatValue());
						}
						else
						{
							field.set(clazz, columnValue);
						}	
					}
				}
				break;
			case java.sql.Types.NUMERIC:
				{
					if (columnValue != null)
					{
						if (field.getType() == int.class)
						{
							field.set(clazz, ((java.math.BigDecimal) columnValue).intValue());
						}
						else if (field.getType() == long.class)
						{
							field.set(clazz, ((java.math.BigDecimal) columnValue).longValue());
						}
						else
						{
							field.set(clazz, columnValue);
						}
					}
				}
				break;
			case java.sql.Types.SMALLINT:
				{
					if (columnValue != null)
					{
						if (field.getType() == int.class)
						{
							field.set(clazz, ((java.lang.Short) columnValue).intValue());
						}
						else
						{
							field.set(clazz, columnValue);
						}
					}
				}
				break;
			case java.sql.Types.TINYINT:
				{
					if (columnValue != null)
					{
						if (field.getType() == int.class)
						{
							field.set(clazz, ((java.lang.Short) columnValue).intValue());
						}
						else
						{
							field.set(clazz, columnValue);
						}
					}
				}
				break;
			default:
				{
					if (columnValue != null)
					{
						field.set(clazz, columnValue);	
					}
				}
				break;
			}
	    }
		catch (SecurityException | IllegalArgumentException | IllegalAccessException e)
		{
			logger.error(String.format("ResultSetMapper<%s>.setProperty Error, fieldName : %s, ValueType : %s"
					, clazz.getClass().getName()
					, field.getName()
					, columnValue.getClass().getName()));
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList<Field> getDeclaredFields(ArrayList<Field> fields, Class clazz)
	{
		if (clazz == null || clazz == java.lang.Object.class)
		{
			return fields;
		}
		
		Field[] declaredFields = clazz.getDeclaredFields();

		fields.addAll(Arrays.asList(declaredFields));
		
		return getDeclaredFields(fields, clazz.getSuperclass());
	}
	
	@SuppressWarnings({ "rawtypes" })
	public ArrayList<T> resultSetToList(ResultSet rs, Class clazz)
	{
		return resultSetToList(rs, clazz, null);
	}
						
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList<T> resultSetToList(ResultSet rs, Class clazz, RowItemFinishCallback<T> rowItemFinish)
	{
		ArrayList<T> outputList = new ArrayList<>();
		try
		{
			// make sure resultset is not null
			if (rs != null)
			{
				// get the resultset metadata
				ResultSetMetaData rsmd = rs.getMetaData();

				// get all the attributes of Class clazz
				ArrayList<Field> fields = getDeclaredFields(new ArrayList<>(), clazz);
				
				while (rs.next())
				{
					T bean = (T) clazz.newInstance();

					for (int _iterator = 0; _iterator < rsmd.getColumnCount(); ++_iterator)
					{
						// get the SQL column name
						String columnName = rsmd.getColumnName(_iterator + 1);
						int columnType = rsmd.getColumnType(_iterator + 1);

						// get the value of the SQL column
						Object columnValue = rs.getObject(_iterator + 1);

						// iterating over clazz attributes to check
						// if any attribute has 'Column' annotation with matching 'name' value
						for (Field field : fields)
						{
							if (field.isAnnotationPresent(Column.class))
							{
								Column column = field.getAnnotation(Column.class);
								if (column.name().equalsIgnoreCase(columnName))
								{
									this.setProperty(bean, field, columnType, columnValue);
									break;
								}
							}
							else if (field.getName().equalsIgnoreCase(columnName))
							{
								this.setProperty(bean, field, columnType, columnValue);
								break;
							}
						} // EndOf for(Field field : fields)
					}// EndOf for(_iterator...)
					
					if (rowItemFinish != null)
					{
						rowItemFinish.call(bean);
					}

					outputList.add(bean);
				} // EndOf while(rs.next())
			}
			else
			{
				// throw some error that Class clazz
				// does not have @Entity annotation
				return new ArrayList<>();
			}
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		
		return outputList;
	}
	
	
	
	

	@SuppressWarnings({ "rawtypes" })
	public T resultSetToObject(ResultSet rs, Class clazz)
	{
		return resultSetToObject(rs, clazz, null);
	}
						
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public T resultSetToObject(ResultSet rs, Class clazz, RowItemFinishCallback<T> rowItemFinish)
	{
		T bean = null;
		
		try
		{
			bean = (T) clazz.newInstance();
			// make sure resultset is not null
			if (rs != null)
			{
				// get the resultset metadata
				ResultSetMetaData rsmd = rs.getMetaData();

				// get all the attributes of Class clazz
				ArrayList<Field> fields = getDeclaredFields(new ArrayList<>(), clazz);
				
				if (rs.next())
				{
					for (int _iterator = 0; _iterator < rsmd.getColumnCount(); ++_iterator)
					{
						// get the SQL column name
						String columnName = rsmd.getColumnName(_iterator + 1);
						int columnType = rsmd.getColumnType(_iterator + 1);

						// get the value of the SQL column
						Object columnValue = rs.getObject(_iterator + 1);

						// iterating over clazz attributes to check
						// if any attribute has 'Column' annotation with matching 'name' value
						for (Field field : fields)
						{
							if (field.isAnnotationPresent(Column.class))
							{
								Column column = field.getAnnotation(Column.class);
								if (column.name().equalsIgnoreCase(columnName))
								{
									this.setProperty(bean, field, columnType, columnValue);
									break;
								}
							}
							else if (field.getName().equalsIgnoreCase(columnName))
							{
								this.setProperty(bean, field, columnType, columnValue);
								break;
							}
						} // EndOf for(Field field : fields)
					}// EndOf for(_iterator...)
					
					if (rowItemFinish != null)
					{
						rowItemFinish.call(bean);
					}
				} // EndOf while(rs.next())
			}
			else
			{
				bean = (T) clazz.newInstance();
			}
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		
		return bean;
	}
}