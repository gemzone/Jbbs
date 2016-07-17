package com.modjk.jbbs.data;

import java.util.List;

import javax.sql.DataSource;

public interface PostsDAO
{
	public void setDataSource(DataSource ds);
	   
	   public long create(Long userId, String name, String title, String text, String file1, String file2, String link1, String link2);
	   
	   public Posts get(Long postId);
	   
	   public List<Posts> list();
	   
	   public void delete(Long postId);
	   
	   public void update(Long postId, Long userId, String name, String title, String text, String file1, String file2, String link1, String link2);
}
