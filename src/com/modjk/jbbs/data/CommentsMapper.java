/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.modjk.module.mapping.ResultSetMapper;

public class CommentsMapper implements RowMapper<Comments> 
{
	// private static final Logger logger = LoggerFactory.getLogger(UserMapper.class);
	public Comments mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ResultSetMapper<Comments> mapper = new ResultSetMapper<>();
		Comments o = mapper.resultSetForMapping(rs, Comments.class);
		return o;
	}
}