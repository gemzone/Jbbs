/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.modjk.module.mapping.ResultSetMapper;

public class PostsMapper implements RowMapper<Posts> 
{
	// private static final Logger logger = LoggerFactory.getLogger(UserMapper.class);
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ResultSetMapper<Posts> mapper = new ResultSetMapper<>();
		Posts o = mapper.resultSetForMapping(rs, Posts.class);
		return o;
	}
}