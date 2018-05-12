package com.techoffice.database.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheUtil {

	private static Map<Class<?>, Map<String, List<?>>> cacheMap = new ConcurrentHashMap<Class<?>, Map<String, List<?>>>(); 
	
	private CacheUtil(){};
	
	public static synchronized Map<String, List<?>> getCache(Class<?> clazz){
		Map<String, List<?>> cache = cacheMap.get(clazz);
		if (cache != null){
			return cache;
		}
		cache = new ConcurrentHashMap<String, List<?>>();
		cacheMap.put(clazz, cache);
		return cache;
	}
	
	
}
