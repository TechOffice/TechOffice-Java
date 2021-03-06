package com.techoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(ModelMap model){
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}
	
	@ResponseBody
	@RequestMapping(value="/sayhi", method=RequestMethod.GET)
	public String sayHi(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hi!";
	}
	
	@ResponseBody
	@RequestMapping(value="/saybye", method=RequestMethod.GET)
	public String sayBye(){
		return "Bye!";
	}
}
