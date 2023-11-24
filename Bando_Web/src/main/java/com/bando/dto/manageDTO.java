package com.bando.dto;

import java.util.Date;

public class manageDTO {
	
	private int pdtnum;
	private Date butdate; 		 // 작성날짜
	private String product; 	 // 제품명
	private String purchasecomp; // 구매처
	private String reposibility; // 담당자
	private int pweight; 		 // 폭 길이
	private int plength; 		 // 가로 길이
	private int quantity; 		 // 수량
	private int pchprice; 		 // 구매가
	private int price;			 // 단가
	private int tax; 			 // 세액
	private int difference; 	 // 차액
	
	public manageDTO() {
		
	}

	public manageDTO(int pdtnum, Date butdate, String product, String purchasecomp, String reposibility, int pweight,
			int plength, int quantity, int pchprice, int price, int tax, int difference) {
		super();
		this.pdtnum = pdtnum;
		this.butdate = butdate;
		this.product = product;
		this.purchasecomp = purchasecomp;
		this.reposibility = reposibility;
		this.pweight = pweight;
		this.plength = plength;
		this.quantity = quantity;
		this.pchprice = pchprice;
		this.price = price;
		this.tax = tax;
		this.difference = difference;
	}

	public int getPdtnum() {
		return pdtnum;
	}

	public void setPdtnum(int pdtnum) {
		this.pdtnum = pdtnum;
	}

	public Date getButdate() {
		return butdate;
	}

	public void setButdate(Date butdate) {
		this.butdate = butdate;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPurchasecomp() {
		return purchasecomp;
	}

	public void setPurchasecomp(String purchasecomp) {
		this.purchasecomp = purchasecomp;
	}

	public String getReposibility() {
		return reposibility;
	}

	public void setReposibility(String reposibility) {
		this.reposibility = reposibility;
	}

	public int getPweight() {
		return pweight;
	}

	public void setPweight(int pweight) {
		this.pweight = pweight;
	}

	public int getPlength() {
		return plength;
	}

	public void setPlength(int plength) {
		this.plength = plength;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPchprice() {
		return pchprice;
	}

	public void setPchprice(int pchprice) {
		this.pchprice = pchprice;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getDifference() {
		return difference;
	}

	public void setDifference(int difference) {
		this.difference = difference;
	}

	@Override
	public String toString() {
		return "manageDTO [pdtnum=" + pdtnum + ", butdate=" + butdate + ", product=" + product + ", purchasecomp="
				+ purchasecomp + ", reposibility=" + reposibility + ", pweight=" + pweight + ", plength=" + plength
				+ ", quantity=" + quantity + ", pchprice=" + pchprice + ", price=" + price + ", tax=" + tax
				+ ", difference=" + difference + "]";
	}

	

	
	
	
	
	

}
