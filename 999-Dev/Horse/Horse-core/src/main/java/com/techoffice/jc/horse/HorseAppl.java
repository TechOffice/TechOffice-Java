package com.techoffice.jc.horse;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;

@Component
public class HorseAppl {
	
	
	@Transactional
	public void run() throws FailingHttpStatusCodeException, MalformedURLException, XPathExpressionException, IOException, ParserConfigurationException, SAXException, InterruptedException, TransformerException{

	}
	
	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, XPathExpressionException, IOException, ParserConfigurationException, SAXException, InterruptedException, TransformerException{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HorseAppl appl = context.getBean(HorseAppl.class);
		appl.run();
	}
}
