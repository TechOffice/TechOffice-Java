package com.techoffice.yahoo.finance.stock.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techoffice.hkex.csvimport.stock.model.Stock;
import com.techoffice.util.service.JobExplorerService;
import com.techoffice.yahoo.finance.stock.dao.PriceBatchDao;
import com.techoffice.yahoo.finance.stock.dao.PriceDao;
import com.techoffice.yahoo.finance.stock.model.Price;
import com.techoffice.yahoo.finance.stock.model.PriceBatch;

@Service
public class PriceBatchService {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SimpleJobLauncher simpleAsyncJobLauncher;
	
	@Autowired
	private PriceBatchDao priceBatchDao;

	@Autowired
	private PriceDao priceDao;
	
	@Autowired
	private JobExplorerService jobExplorerService;
	
	@Transactional
	public List<PriceBatch> list(){
		return priceBatchDao.list();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updatePrices(Stock stock, List<Price> prices){
		log.info("Now Updating: " + stock.getStockCode());
		PriceBatch priceBatch = priceBatchDao.get(stock.getStockCode());
		if (priceBatch == null){
			priceBatch = new PriceBatch();
			priceBatch.setStockCode(stock.getStockCode());
		}
		priceDao.delete(stock.getStockCode());
		priceDao.add(prices);
		priceBatch.setLastExecuted(new Date());
		priceBatchDao.update(priceBatch);
		log.info("Stock [" + stock.getStockCode() + "] - Updated");
	}
}
