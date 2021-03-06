package com.techoffice.database.h2.util;

import java.util.List;

import com.techoffice.database.dao.util.DaoUtil;
import com.techoffice.database.h2.connection.H2DatabaseConnection;

public class H2DaoUtil {

	static {
		try {
			Class.forName("com.techoffice.database.h2.connection.H2DatabaseConnection");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> List<T> list(Class<T> instanceClazz, Class<?> daoClazz, String query){
		return DaoUtil.list(H2DatabaseConnection.class, daoClazz, instanceClazz, query);
	}
}
