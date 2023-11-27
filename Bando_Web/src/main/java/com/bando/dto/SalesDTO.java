package com.bando.dto;

public class SalesDTO {

	private int total_pchprice;
	private int total_difference;
	
	public SalesDTO() {	
	}

	public SalesDTO(int total_pchprice, int total_difference) {
		super();
		this.total_pchprice = total_pchprice;
		this.total_difference = total_difference;
	}

	public int getTotal_pchprice() {
		return total_pchprice;
	}

	public void setTotal_pchprice(int total_pchprice) {
		this.total_pchprice = total_pchprice;
	}

	public int getTotal_difference() {
		return total_difference;
	}

	public void setTotal_difference(int total_difference) {
		this.total_difference = total_difference;
	}

	@Override
	public String toString() {
		return "SalesDTO [total_pchprice=" + total_pchprice + ", total_difference=" + total_difference + "]";
	}
	
	
	
	
	
	
}
