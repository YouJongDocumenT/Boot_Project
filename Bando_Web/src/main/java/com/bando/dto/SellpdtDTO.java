package com.bando.dto;

import java.util.Date;

public class SellpdtDTO {
	
	private int machine_id;
	private String responsibility;
	private int ph_number;
	private Date sell_date;
	private int sell_quantity;
	private int sell_length;
	private int sell_weight;
	private int sell_price;
	private int tax;
	
	public SellpdtDTO() {

	}

	public SellpdtDTO(int machine_id, String responsibility, int ph_number, Date sell_date, int sell_quantity,
			int sell_length, int sell_weight, int sell_price, int tax) {
		super();
		this.machine_id = machine_id;
		this.responsibility = responsibility;
		this.ph_number = ph_number;
		this.sell_date = sell_date;
		this.sell_quantity = sell_quantity;
		this.sell_length = sell_length;
		this.sell_weight = sell_weight;
		this.sell_price = sell_price;
		this.tax = tax;
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

	@Override
	public String toString() {
		return "SellpdtDTO [machine_id=" + machine_id + ", responsibility=" + responsibility + ", ph_number="
				+ ph_number + ", sell_date=" + sell_date + ", sell_quantity=" + sell_quantity + ", sell_length="
				+ sell_length + ", sell_weight=" + sell_weight + ", sell_price=" + sell_price + ", tax=" + tax + "]";
	}

	
	
	

}
