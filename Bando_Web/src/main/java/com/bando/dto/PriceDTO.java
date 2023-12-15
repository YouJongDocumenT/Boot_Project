package com.bando.dto;

public class PriceDTO {
	
	private int stock_price;
	private int allpurchcnt;
	private int allsellcnt;
	
	public PriceDTO() {
	}

	public PriceDTO(int stock_price, int allpurchcnt, int allsellcnt) {
		super();
		this.stock_price = stock_price;
		this.allpurchcnt = allpurchcnt;
		this.allsellcnt = allsellcnt;
	}

	public int getStock_price() {
		return stock_price;
	}

	public void setStock_price(int stock_price) {
		this.stock_price = stock_price;
	}

	public int getAllpurchcnt() {
		return allpurchcnt;
	}

	public void setAllpurchcnt(int allpurchcnt) {
		this.allpurchcnt = allpurchcnt;
	}

	public int getAllsellcnt() {
		return allsellcnt;
	}

	public void setAllsellcnt(int allsellcnt) {
		this.allsellcnt = allsellcnt;
	}

	@Override
	public String toString() {
		return "PriceDTO [stock_price=" + stock_price + ", allpurchcnt=" + allpurchcnt + ", allsellcnt=" + allsellcnt
				+ "]";
	}
	
	
	
	

}
