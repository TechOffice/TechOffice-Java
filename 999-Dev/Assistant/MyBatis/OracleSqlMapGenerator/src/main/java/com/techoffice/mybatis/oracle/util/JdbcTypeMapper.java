package com.techoffice.mybatis.oracle.util;

import java.util.HashMap;
import java.util.Map;

public class JdbcTypeMapper {
	
	private static final Map<String, String> map;
	static{
		map = new HashMap<String, String>();
		map.put("VARCHAR2", "VARCHAR");
		map.put("NUMBER", "NUMERIC");
	}
	
	public static String get(String dataType){
		return map.get(dataType);
	}

}
