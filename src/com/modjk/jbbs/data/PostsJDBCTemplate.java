package com.modjk.jbbs.data;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class PostsJDBCTemplate implements PostsDAO
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
	public long create(Long userId, String name, String title, String text, String file1, String file2, String link1,
			String link2)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Posts get(Long postId)
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Posts> list()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(Long postId)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Long postId, Long userId, String name, String title, String text, String file1, String file2,
			String link1, String link2)
	{
		// TODO Auto-generated method stub
		
	}

	
}
