/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data.mapping;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.modjk.jbbs.data.User;
import com.modjk.module.mapping.ResultSetMapper;

public class UserMapper implements RowMapper<User> 
{
	private static final Logger logger = LoggerFactory.getLogger(UserMapper.class);
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		logger.debug( "" + rowNum );
		User user = new User ();
		
		
		user.user_id = rs.getLong("user_id");
		user.name = rs.getString("name");
		
		ResultSetMapper<User> mapper = new ResultSetMapper<>();
		user = mapper.resultSetToObject(rs, User.class);
//		ResultSetMapper<User> mapper = new ResultSetMapper<>();
//		User user = mapper.resultSetToObject(rs, User.class);
		return user;
	}
}