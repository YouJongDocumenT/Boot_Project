package com.bando.dto;

import java.util.Date;

public class SellpdtDTO {
	
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
	private int total_sell_price;
	private int total_tax;
	private int sell_EAprice;
	
	public SellpdtDTO() {

	}

	public SellpdtDTO(int client_id, int machine_id, String responsibility, int ph_number, Date sell_date,
			int sell_quantity, int sell_length, int sell_weight, int sell_price, int tax, String sell_pdt,
			int total_sell_price, int total_tax, int sell_EAprice) {
		super();
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
		this.total_sell_price = total_sell_price;
		this.total_tax = total_tax;
		this.sell_EAprice = sell_EAprice;
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

	public int getTotal_sell_price() {
		return total_sell_price;
	}

	public void setTotal_sell_price(int total_sell_price) {
		this.total_sell_price = total_sell_price;
	}

	public int getTotal_tax() {
		return total_tax;
	}

	public void setTotal_tax(int total_tax) {
		this.total_tax = total_tax;
	}

	public int getSell_EAprice() {
		return sell_EAprice;
	}

	public void setSell_EAprice(int sell_EAprice) {
		this.sell_EAprice = sell_EAprice;
	}

	@Override
	public String toString() {
		return "SellpdtDTO [client_id=" + client_id + ", machine_id=" + machine_id + ", responsibility="
				+ responsibility + ", ph_number=" + ph_number + ", sell_date=" + sell_date + ", sell_quantity="
				+ sell_quantity + ", sell_length=" + sell_length + ", sell_weight=" + sell_weight + ", sell_price="
				+ sell_price + ", tax=" + tax + ", sell_pdt=" + sell_pdt + ", total_sell_price=" + total_sell_price
				+ ", total_tax=" + total_tax + ", sell_EAprice=" + sell_EAprice + "]";
	}

	

	

	
	
	
	

}
