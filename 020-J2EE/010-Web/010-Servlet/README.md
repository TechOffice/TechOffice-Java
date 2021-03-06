# Servlet 

Servlet is a java program that extends server capacities. In J2EE, it is an interface that Java Class implements it and provides functionality. Also, J2EE specification also provides an abstract class called HttpServlet so that Java Program could extends it to handle HTTP request.

## Web Application Deployment Descriptor (web.xml)
web.xml define the servlet and its url mapping. Web Server would route the URL Request to the specified Servlet for handling.

**Sample web.xml**
```
<?xml version="1.0" encoding="ISO-8859-1" ?>

<web-app xmlns="http://java.sun.com/xml/ns/j2ee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd"
    version="2.4">

    <display-name>Tech Office Application</display-name>
    <description>
        It is a example appplication in Tech Office.
    </description>
</web-app>     
```

## Implementation
* Tomcat
* Jetty

## Life Cycle of a Servlet

* init()
* service()
* destroy()

# Reference
* https://techofficejava.wordpress.com/j2ee-servlet/
* http://download.oracle.com/otn-pub/jcp/servlet-3.0-fr-eval-oth-JSpec/servlet-3_0-final-spec.pdf
* https://docs.oracle.com/javaee/7/