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
	
	public PurChasePdtDTO() {

	}

	public PurChasePdtDTO(int purchase_id, String product, Date purchase_date, int pur_quantity, int purchase_price,
			int pur_length, int pur_weight) {
		super();
		this.purchase_id = purchase_id;
		Product = product;
		this.purchase_date = purchase_date;
		this.pur_quantity = pur_quantity;
		this.purchase_price = purchase_price;
		this.pur_length = pur_length;
		this.pur_weight = pur_weight;
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

	@Override
	public String toString() {
		return "PurChasePdtDTO [purchase_id=" + purchase_id + ", Product=" + Product + ", purchase_date="
				+ purchase_date + ", pur_quantity=" + pur_quantity + ", purchase_price=" + purchase_price
				+ ", pur_length=" + pur_length + ", pur_weight=" + pur_weight + "]";
	}

	
	
	
	
	
}
