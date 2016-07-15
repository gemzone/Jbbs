/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.modjk.module.mapping.ResultSetMapper;

public class UserMapper implements RowMapper<User> 
{
	// private static final Logger logger = LoggerFactory.getLogger(UserMapper.class);
	public User mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ResultSetMapper<User> mapper = new ResultSetMapper<>();
		User o = mapper.resultSetForMapping(rs, User.class);
		return o;
	}
}