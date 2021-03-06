package com.techoffice.yahoo.finance.stock;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.techoffice.yahoo.finance.stock.crawler.PriceCrawler;
import com.techoffice.yahoo.finance.stock.dao.PriceDao;

@Component
public class StockAppl {
	
	@Autowired
	private PriceCrawler priceCrawler;
	
	@Autowired
	private PriceDao priceDao;
	
	public void run() throws FailingHttpStatusCodeException, MalformedURLException, XPathExpressionException, IOException, ParserConfigurationException, SAXException, InterruptedException, TransformerException, IllegalAccessException, InvocationTargetException{
//		List<Price> prices =stockHistoryDataCrawler.retrieveHistoryPriceData("0939");
//		priceDao.deletePrice("0939");
//		priceDao.addPriceList(prices);
//		List<Price> dbPrices = priceDao.getPriceList();
//		for(Price price: dbPrices){
//			System.out.println(price.getAdjClose());
//		}
	}
	
	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, XPathExpressionException, IOException, ParserConfigurationException, SAXException, InterruptedException, TransformerException, IllegalAccessException, InvocationTargetException{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StockAppl appl = context.getBean(StockAppl.class);
		appl.run();
	}
}
