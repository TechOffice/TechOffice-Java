package com.techoffice.map.hashmapperformance;
import com.techoffice.map.hashmapperformance.model.KeyDifferentHashCode;
import com.techoffice.map.hashmapperformance.model.KeySameHashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapPerformanceTest {

	private static final int instanceCount = 10000;
	private static final int stopCount = 1000;
	
	public static <T> Map<Object, Object> putPerformance(Class<T> clazz) throws Exception{
		Map<Object, Object> map = new HashMap<Object, Object>();
		long start = System.currentTimeMillis();
		for (int i=0; i<instanceCount; i++){
			T instance = clazz.getDeclaredConstructor(int.class).newInstance(i);
			map.put(instance, instance);
			if ((i+1) %stopCount == 0){
				long end = System.currentTimeMillis();
				long duration = end - start;
				start = System.currentTimeMillis();
				System.out.printf("Number of Instance: %10d 	Duration: %10d ms\n", (i+1), duration);
			}
		}
		return map;
	}
	
	public static void getPerformance(Map<Object, Object> map){
		Set<Object> keySet = map.keySet();
		Object[] keys = keySet.toArray();
		long start = System.currentTimeMillis();
		for (int i=0; i<keys.length; i++){
			Object key = keys[i];
			map.get(key);
			if ((i+1) %stopCount == 0){
				long end = System.currentTimeMillis();
				long duration = end - start;
				start = System.currentTimeMillis();
				System.out.printf("Number of Instance: %10d 	Duration: %10d ms\n", (i+1), duration);
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println("Different Hash Code Put Performance");
		Map<Object, Object> differentHashCodeMap = putPerformance(KeyDifferentHashCode.class);
		System.out.println("Same Hash Code Put Performance");
		Map<Object, Object> sameHashCodeMap = putPerformance(KeySameHashCode.class);
		
		System.out.println("Different Hash Code Get Performance");
		getPerformance(differentHashCodeMap);
		System.out.println("Same Hash Code Get Performance");
		getPerformance(sameHashCodeMap);
	}
}
