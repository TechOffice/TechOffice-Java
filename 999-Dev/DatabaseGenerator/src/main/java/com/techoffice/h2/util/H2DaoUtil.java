package com.techoffice.h2.util;

import java.util.List;

import com.techoffice.database.util.DaoUtil;
import com.techoffice.h2.connection.H2DatabaseConnection;

public class H2DaoUtil {

	static {
		try {
			Class.forName("com.techoffice.h2.connection.H2DatabaseConnection");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> List<T> list(Class<T> instanceClazz, Class<?> daoClazz, String query){
		return DaoUtil.list(H2DatabaseConnection.class, daoClazz, instanceClazz, query);
	}
}
