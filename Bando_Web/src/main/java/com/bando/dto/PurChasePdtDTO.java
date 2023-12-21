package com.bando.dto;

import java.sql.Date;

public class PurChasePdtDTO {

	private int purchase_id;
	private String Product;
	private Date purchase_date;
	private int pur_quantity;
	private int purchase_price;
	private int pur_length;
	private int pur_weight;
	private int purchase_pdtnum;
	private int total_purchase_price;
	private int purchase_EAprice;
	
	public PurChasePdtDTO() {

	}

	public PurChasePdtDTO(int purchase_id, String product, Date purchase_date, int pur_quantity, int purchase_price,
			int pur_length, int pur_weight, int purchase_pdtnum, int total_purchase_price, int purchase_EAprice) {
		super();
		this.purchase_id = purchase_id;
		Product = product;
		this.purchase_date = purchase_date;
		this.pur_quantity = pur_quantity;
		this.purchase_price = purchase_price;
		this.pur_length = pur_length;
		this.pur_weight = pur_weight;
		this.purchase_pdtnum = purchase_pdtnum;
		this.total_purchase_price = total_purchase_price;
		this.purchase_EAprice = purchase_EAprice;
	}

	public int getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public int getPur_quantity() {
		return pur_quantity;
	}

	public void setPur_quantity(int pur_quantity) {
		this.pur_quantity = pur_quantity;
	}

	public int getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(int purchase_price) {
		this.purchase_price = purchase_price;
	}

	public int getPur_length() {
		return pur_length;
	}

	public void setPur_length(int pur_length) {
		this.pur_length = pur_length;
	}

	public int getPur_weight() {
		return pur_weight;
	}

	public void setPur_weight(int pur_weight) {
		this.pur_weight = pur_weight;
	}

	public int getPurchase_pdtnum() {
		return purchase_pdtnum;
	}

	public void setPurchase_pdtnum(int purchase_pdtnum) {
		this.purchase_pdtnum = purchase_pdtnum;
	}

	public int getTotal_purchase_price() {
		return total_purchase_price;
	}

	public void setTotal_purchase_price(int total_purchase_price) {
		this.total_purchase_price = total_purchase_price;
	}

	public int getPurchase_EAprice() {
		return purchase_EAprice;
	}

	public void setPurchase_EAprice(int purchase_EAprice) {
		this.purchase_EAprice = purchase_EAprice;
	}

	@Override
	public String toString() {
		return "PurChasePdtDTO [purchase_id=" + purchase_id + ", Product=" + Product + ", purchase_date="
				+ purchase_date + ", pur_quantity=" + pur_quantity + ", purchase_price=" + purchase_price
				+ ", pur_length=" + pur_length + ", pur_weight=" + pur_weight + ", purchase_pdtnum=" + purchase_pdtnum
				+ ", total_purchase_price=" + total_purchase_price + ", purchase_EAprice=" + purchase_EAprice + "]";
	}

	

	

	

	
	
	
	
	
}
