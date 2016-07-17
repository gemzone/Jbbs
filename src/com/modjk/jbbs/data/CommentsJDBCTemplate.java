package com.modjk.jbbs.data;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class CommentsJDBCTemplate implements CommentsDAO
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
	public long create(Long postId, Long userId, String name, String text)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Comments> list(Long postId)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long commentId)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Long commentId, Long postId, Long userId, String name, String text)
	{
		// TODO Auto-generated method stub
		
	}

	
}
