package com.techoffice.hkex.stock;

import org.springframework.boot.SpringApplication;

import com.techoffice.hkex.stock.config.Config;

public class SpringBootExampleAppl {
	
    public static void main(String[] args) throws Exception {
    	SpringApplication.run(Config.class, args);
    }
    
}
