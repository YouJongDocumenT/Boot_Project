package com.bando.dto;

import java.util.Date;

public class AllSellDataDTO {
	
	private String client_company;
	private String machine_name;
	private int client_id;
	private int machine_id;
	private String responsibility;
	private int ph_number;
	private Date sell_date;
	private int sell_quantity;
	private int sell_length;
	private int sell_weight;
	private int sell_price;
	private int tax;
	private String sell_pdt;
	private String standard;
	
	
	
	public AllSellDataDTO() {
	}



	public AllSellDataDTO(String client_company, String machine_name, int client_id, int machine_id,
			String responsibility, int ph_number, Date sell_date, int sell_quantity, int sell_length, int sell_weight,
			int sell_price, int tax, String sell_pdt, String standard) {
		super();
		this.client_company = client_company;
		this.machine_name = machine_name;
		this.client_id = client_id;
		this.machine_id = machine_id;
		this.responsibility = responsibility;
		this.ph_number = ph_number;
		this.sell_date = sell_date;
		this.sell_quantity = sell_quantity;
		this.sell_length = sell_length;
		this.sell_weight = sell_weight;
		this.sell_price = sell_price;
		this.tax = tax;
		this.sell_pdt = sell_pdt;
		this.standard = standard;
	}



	public String getClient_company() {
		return client_company;
	}



	public void setClient_company(String client_company) {
		this.client_company = client_company;
	}



	public String getMachine_name() {
		return machine_name;
	}



	public void setMachine_name(String machine_name) {
		this.machine_name = machine_name;
	}



	public int getClient_id() {
		return client_id;
	}



	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}



	public int getMachine_id() {
		return machine_id;
	}



	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}



	public String getResponsibility() {
		return responsibility;
	}



	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}



	public int getPh_number() {
		return ph_number;
	}



	public void setPh_number(int ph_number) {
		this.ph_number = ph_number;
	}



	public Date getSell_date() {
		return sell_date;
	}



	public void setSell_date(Date sell_date) {
		this.sell_date = sell_date;
	}



	public int getSell_quantity() {
		return sell_quantity;
	}



	public void setSell_quantity(int sell_quantity) {
		this.sell_quantity = sell_quantity;
	}



	public int getSell_length() {
		return sell_length;
	}



	public void setSell_length(int sell_length) {
		this.sell_length = sell_length;
	}



	public int getSell_weight() {
		return sell_weight;
	}



	public void setSell_weight(int sell_weight) {
		this.sell_weight = sell_weight;
	}



	public int getSell_price() {
		return sell_price;
	}



	public void setSell_price(int sell_price) {
		this.sell_price = sell_price;
	}



	public int getTax() {
		return tax;
	}



	public void setTax(int tax) {
		this.tax = tax;
	}



	public String getSell_pdt() {
		return sell_pdt;
	}



	public void setSell_pdt(String sell_pdt) {
		this.sell_pdt = sell_pdt;
	}



	public String getStandard() {
		return standard;
	}



	public void setStandard(String standard) {
		this.standard = standard;
	}



	@Override
	public String toString() {
		return "AllSellDataDTO [client_company=" + client_company + ", machine_name=" + machine_name + ", client_id="
				+ client_id + ", machine_id=" + machine_id + ", responsibility=" + responsibility + ", ph_number="
				+ ph_number + ", sell_date=" + sell_date + ", sell_quantity=" + sell_quantity + ", sell_length="
				+ sell_length + ", sell_weight=" + sell_weight + ", sell_price=" + sell_price + ", tax=" + tax
				+ ", sell_pdt=" + sell_pdt + ", standard=" + standard + "]";
	}

	

}
