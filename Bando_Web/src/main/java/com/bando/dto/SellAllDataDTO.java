package com.bando.dto;

import java.util.Date;

public class SellAllDataDTO {
	
	private String client_id;
	private String client_company;
    private String address;
    private String comp_number;
    private String email;
    private String machine_id;
    private String machine_name;
    private String machine_memo;
    private String resp_id;
    private String responsibility;
    private String ph_number;
    private Date sell_date;
    private int sell_quantity;
    private int sell_length;
    private int sell_weight;
    private int sell_price;
    private int tax;
    private String sell_pdt;
    
	public SellAllDataDTO() {

	}

	public SellAllDataDTO(String client_id, String client_company, String address, String comp_number, String email,
			String machine_id, String machine_name, String machine_memo, String resp_id, String responsibility,
			String ph_number, Date sell_date, int sell_quantity, int sell_length, int sell_weight, int sell_price,
			int tax, String sell_pdt) {
		super();
		this.client_id = client_id;
		this.client_company = client_company;
		this.address = address;
		this.comp_number = comp_number;
		this.email = email;
		this.machine_id = machine_id;
		this.machine_name = machine_name;
		this.machine_memo = machine_memo;
		this.resp_id = resp_id;
		this.responsibility = responsibility;
		this.ph_number = ph_number;
		this.sell_date = sell_date;
		this.sell_quantity = sell_quantity;
		this.sell_length = sell_length;
		this.sell_weight = sell_weight;
		this.sell_price = sell_price;
		this.tax = tax;
		this.sell_pdt = sell_pdt;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_company() {
		return client_company;
	}

	public void setClient_company(String client_company) {
		this.client_company = client_company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(String machine_id) {
		this.machine_id = machine_id;
	}

	public String getMachine_name() {
		return machine_name;
	}

	public void setMachine_name(String machine_name) {
		this.machine_name = machine_name;
	}

	public String getMachine_memo() {
		return machine_memo;
	}

	public void setMachine_memo(String machine_memo) {
		this.machine_memo = machine_memo;
	}

	public String getResp_id() {
		return resp_id;
	}

	public void setResp_id(String resp_id) {
		this.resp_id = resp_id;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getPh_number() {
		return ph_number;
	}

	public void setPh_number(String ph_number) {
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

	@Override
	public String toString() {
		return "SellAllDataDTO [client_id=" + client_id + ", client_company=" + client_company + ", address=" + address
				+ ", comp_number=" + comp_number + ", email=" + email + ", machine_id=" + machine_id + ", machine_name="
				+ machine_name + ", machine_memo=" + machine_memo + ", resp_id=" + resp_id + ", responsibility="
				+ responsibility + ", ph_number=" + ph_number + ", sell_date=" + sell_date + ", sell_quantity="
				+ sell_quantity + ", sell_length=" + sell_length + ", sell_weight=" + sell_weight + ", sell_price="
				+ sell_price + ", tax=" + tax + ", sell_pdt=" + sell_pdt + "]";
	}

	
	

	


    

}







