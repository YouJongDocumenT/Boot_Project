package com.bando.dto;

public class PurchaseCompDTO {
	
	private int purchase_id;
	private String purchase_company;
	private String adress;
	private String comp_number;
	private String email;
	
	
	public PurchaseCompDTO() {
	}


	public PurchaseCompDTO(int purchase_id, String purchase_company, String adress, String comp_number, String email) {
		super();
		this.purchase_id = purchase_id;
		this.purchase_company = purchase_company;
		this.adress = adress;
		this.comp_number = comp_number;
		this.email = email;
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


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getComp_number() {
		return comp_number;
	}


	public void setComp_number(String comp_number) {
		this.comp_number = comp_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "PurchaseCompDTO [purchase_id=" + purchase_id + ", purchase_company=" + purchase_company + ", adress="
				+ adress + ", comp_number=" + comp_number + ", email=" + email + "]";
	}


	
	
	
	

}
