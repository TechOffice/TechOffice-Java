package com.techoffice.map;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The ConcurrentHash Map would care every entry in the map while the hash map would throw concurrent modification exception.
 * @author Ben_c
 *
 */
public class ConcurrentHashMapExample {
	public static void main(String[] args) throws InterruptedException, IOException{
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		Iterator<String> it = myMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) myMap.put(key+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);

		//HashMap
		myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			if(key.equals("3")) myMap.put(key+"new", "new3");
		}
		System.out.println("HashMap after iterator: "+myMap);
		

	}
}