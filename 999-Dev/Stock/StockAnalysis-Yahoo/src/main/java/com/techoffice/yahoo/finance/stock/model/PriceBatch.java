package com.techoffice.yahoo.finance.stock.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="PRICE_BATCH")
@Entity
public class PriceBatch {
	
	@Id
	private String stockCode;
	private Date lastExecuted;
	
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public Date getLastExecuted() {
		return lastExecuted;
	}
	public void setLastExecuted(Date lastExecuted) {
		this.lastExecuted = lastExecuted;
	}
	
	
}
