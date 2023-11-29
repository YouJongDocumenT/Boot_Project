package com.bando.dto;

public class ClientDTO {
	
	private int client_id;
	private String client_company;
	private String address;
	private String comp_number;
	private String email;
	
	
	public ClientDTO() {
		
	}


	public ClientDTO(int client_id, String client_company, String address, String comp_number, String email) {
		super();
		this.client_id = client_id;
		this.client_company = client_company;
		this.address = address;
		this.comp_number = comp_number;
		this.email = email;
	}


	public int getClient_id() {
		return client_id;
	}


	public void setClient_id(int client_id) {
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


	@Override
	public String toString() {
		return "ClientDTO [client_id=" + client_id + ", client_company=" + client_company + ", address=" + address
				+ ", comp_number=" + comp_number + ", email=" + email + "]";
	}

	
	
	
	

}
