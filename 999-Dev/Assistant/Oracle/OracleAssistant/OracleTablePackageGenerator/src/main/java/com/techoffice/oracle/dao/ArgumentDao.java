package com.techoffice.oracle.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository 
public class ArgumentDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	 
}
