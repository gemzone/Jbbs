package com.modjk.jbbs.data;

import java.util.List;

import javax.sql.DataSource;

public interface CommentsDAO
{
	public void setDataSource(DataSource ds);
	   
	   public long create(Long postId, Long userId, String name, String text);
	   
	   public List<Comments> list(Long postId);
	   
	   public void delete(Long commentId);
	   
	   public void update(Long commentId, Long postId, Long userId, String name, String text);
}
