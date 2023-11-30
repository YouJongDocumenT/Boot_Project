package com.bando.dto;

import java.sql.Date;

public class AllPurchaseDataDTO {
	
	private int purchase_id;
	private String purchase_company;
	private String address;
	private int comp_number;
	private String email;
	private String Product;
	private Date purchase_date;
	private int pur_quantity;
	private int purchase_price;
	private int pur_length;
	private int pur_weight;
	
	public AllPurchaseDataDTO() {

	}

	public AllPurchaseDataDTO(int purchase_id, String purchase_company, String address, int comp_number, String email,
			String product, Date purchase_date, int pur_quantity, int purchase_price, int pur_length, int pur_weight) {
		super();
		this.purchase_id = purchase_id;
		this.purchase_company = purchase_company;
		this.address = address;
		this.comp_number = comp_number;
		this.email = email;
		this.Product = product;
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

	public String getPurchase_company() {
		return purchase_company;
	}

	public void setPurchase_company(String purchase_company) {
		this.purchase_company = purchase_company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getComp_number() {
		return comp_number;
	}

	public void setComp_number(int comp_number) {
		this.comp_number = comp_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "AllPurchaseDataDTO [purchase_id=" + purchase_id + ", purchase_company=" + purchase_company
				+ ", address=" + address + ", comp_number=" + comp_number + ", email=" + email + ", Product=" + Product
				+ ", purchase_date=" + purchase_date + ", pur_quantity=" + pur_quantity + ", purchase_price="
				+ purchase_price + ", pur_length=" + pur_length + ", pur_weight=" + pur_weight + "]";
	}

	
	
	
	

}
