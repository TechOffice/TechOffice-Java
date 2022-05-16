package com.techoffice.property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyExample {
	public static void main(String[] args) throws IOException{
		Properties properties = new Properties();
		InputStream is = PropertyExample.class.getClassLoader().getResourceAsStream("application.properties");
		properties.load(is);
		String name = properties.getProperty("name");
		System.out.println(name);
	}
}
