package com.bando.dto;

import java.util.Date;

public class StockListDTO {
	
	private int length;
	private int weight;
	private int purchase_price;
	private int quantity;
	private String purchase_company;
	private String product;
	private int purchase_pdtnum;
	private Date stock_date;
	private int purchase_EAprice;
	
	
	public StockListDTO() {
	}


	public StockListDTO(int length, int weight, int purchase_price, int quantity, String purchase_company,
			String product, int purchase_pdtnum, Date stock_date, int purchase_EAprice) {
		super();
		this.length = length;
		this.weight = weight;
		this.purchase_price = purchase_price;
		this.quantity = quantity;
		this.purchase_company = purchase_company;
		this.product = product;
		this.purchase_pdtnum = purchase_pdtnum;
		this.stock_date = stock_date;
		this.purchase_EAprice = purchase_EAprice;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getPurchase_price() {
		return purchase_price;
	}


	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getPurchase_company() {
		return purchase_company;
	}


	public void setPurchase_company(String purchase_company) {
		this.purchase_company = purchase_company;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public int getPurchase_pdtnum() {
		return purchase_pdtnum;
	}


	public void setPurchase_pdtnum(int purchase_pdtnum) {
		this.purchase_pdtnum = purchase_pdtnum;
	}


	public Date getStock_date() {
		return stock_date;
	}


	public void setStock_date(Date stock_date) {
		this.stock_date = stock_date;
	}


	public int getPurchase_EAprice() {
		return purchase_EAprice;
	}


	public void setPurchase_EAprice(int purchase_EAprice) {
		this.purchase_EAprice = purchase_EAprice;
	}


	@Override
	public String toString() {
		return "StockListDTO [length=" + length + ", weight=" + weight + ", purchase_price=" + purchase_price
				+ ", quantity=" + quantity + ", purchase_company=" + purchase_company + ", product=" + product
				+ ", purchase_pdtnum=" + purchase_pdtnum + ", stock_date=" + stock_date + ", purchase_EAprice="
				+ purchase_EAprice + "]";
	}

	

	
	
	
	
	
	

}
