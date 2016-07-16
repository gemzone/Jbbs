/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.modjk.module.mapping.ResultSetMapper;

public class QueryResultMapper implements RowMapper<QueryResult> 
{
	@Override
	public QueryResult mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		ResultSetMapper<QueryResult> mapper = new ResultSetMapper<>();
		QueryResult o = mapper.resultSetForMapping(rs, QueryResult.class);
		return o;
	}
}
