/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.modjk.module.mapping.ResultSetMapper;

public class ResultMapper implements RowMapper<Result> 
{

	@Override
	public Result mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ResultSetMapper<Result> mapper = new ResultSetMapper<>();
		Result o = mapper.resultSetForMapping(rs, Result.class);
		return o;
	}
}
