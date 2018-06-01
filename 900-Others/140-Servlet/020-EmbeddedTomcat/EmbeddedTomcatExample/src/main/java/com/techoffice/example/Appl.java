package com.techoffice.example;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Appl {
	
	@SuppressWarnings("serial")
	public static void main(String[] args) throws LifecycleException, IOException{		
		int port = 8888;
	    Tomcat tomcat = new Tomcat();
	    tomcat.setPort(port);
	    
	    //  
		File tempFolder = Files.createTempDirectory(null).toFile();
		tempFolder.deleteOnExit();
	    tomcat.setBaseDir(tempFolder.getAbsolutePath());
	    
	    // 
        Context ctx = tomcat.addContext("/", new File(".").getAbsolutePath());
        Tomcat.addServlet(ctx, "Embedded", new HttpServlet() {
            @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp) 
                    throws ServletException, IOException {
                
                Writer w = resp.getWriter();
                w.write("Tomcat Test\n");
                w.flush();
                w.close();
            }
        });
        ctx.addServletMapping("/*", "Embedded");        
	    tomcat.start();
	    
	    System.out.println("Server is starting at localhost:" + port);
	    System.out.println("Server Temporay Directory: " + tempFolder.getAbsolutePath());
	    
	    tomcat.getServer().await();
	}
	
}
