package com.modjk.jbbs.data;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJDBCTemplate implements UserDAO
{
	private static final Logger logger = LoggerFactory.getLogger(UserJDBCTemplate.class);
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource ds)
	{
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
		
		logger.debug("setDataSource");
	}
	@Override
	public long create(String id, String password, String name, String email, String comment)
	{
		Integer groupId = 0;
		Integer level = 9;
		Integer point = 0;
		Integer isSuperAdmin = 0;
		
		long identity = 0;
		{
			String sql = "SELECT ISNULL(MAX([user_id]), 0) + 1 AS [identity] FROM [dbo].[jnk_user]";
			QueryResult r = jdbcTemplateObject.queryForObject(sql, new QueryResultMapper() );
			identity = r.identity;
		}
		
		{
			// 중간에 null은 password_sha3 부분임
			String sql = "INSERT INTO [dbo].[jnk_user] ([user_id], [group_id], [id], [password_sha2_512], [password_sha3], [name], [email], [level], [point], [comment], [is_superadmin]) " +
							"VALUES (?, ?, ?, HASHBYTES('SHA2_512' , ? ), ?, ?, ?, ?, ?, ?, ?); ";

			// TODO jdbcTemplateObject.update 실행시 결과 리턴 1 이 어떤의미인지 모름
			jdbcTemplateObject.update(sql, 
					identity, groupId, id, password, null, name, email, level, point, comment, isSuperAdmin);
		}
		return identity;
	}
	
	@Override
	public User get(Long userId)
	{
		try
		{
			String sql = "SELECT TOP 1 * FROM [Jbbs].[dbo].[jnk_user] WHERE [user_id] = ?";
			User user = jdbcTemplateObject.queryForObject(sql, new Object[]{ userId },  new UserMapper());
			return user;
		}
		catch (EmptyResultDataAccessException e) 
		{
		   return null;
		}
	}
	
	@Override
	public User login(String userId, String password)
	{
		try
		{
			String sql = "SELECT TOP 1 * FROM [Jbbs].[dbo].[jnk_user] WHERE [id] = ? AND [password_sha2_512] = HASHBYTES('SHA2_512' , CONVERT(NVARCHAR, ? ) )";
			User user = jdbcTemplateObject.queryForObject(sql, new Object[]{ userId, password },  new UserMapper());
			return user;
		}
		catch (EmptyResultDataAccessException e) 
		{
		   return null;
		}
	}
	
	@Override
	public List<User> list()
	{
		List<User> list = jdbcTemplateObject.query("SELECT TOP 10 * FROM [dbo].[jnk_user] WHERE id LIKE '%"+ "abc" +"%' ", new Object[]{ }, new UserMapper());
		
		return list;
	}
	@Override
	public void delete(Integer id)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Integer id, Integer age)
	{
		// TODO Auto-generated method stub
	}
	
}
