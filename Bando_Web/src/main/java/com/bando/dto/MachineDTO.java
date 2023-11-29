package com.bando.dto;

public class MachineDTO {

	private int machine_id;
	private int client_id;
	private String machine_name;
	private String machine_memo;
	
	public MachineDTO() {
	}

	public MachineDTO(int machine_id, int client_id, String machine_name, String machine_memo) {
		super();
		this.machine_id = machine_id;
		this.client_id = client_id;
		this.machine_name = machine_name;
		this.machine_memo = machine_memo;
	}

	public int getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(int machine_id) {
		this.machine_id = machine_id;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
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

	@Override
	public String toString() {
		return "MachineDTO [machine_id=" + machine_id + ", client_id=" + client_id + ", machine_name=" + machine_name
				+ ", machine_memo=" + machine_memo + "]";
	}
	
	
	
	
	
	
}
