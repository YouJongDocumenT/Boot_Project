package com.bando.dao;

import java.util.List;

import com.bando.dto.ClientDTO;
import com.bando.dto.MachineDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SellpdtDTO;
import com.bando.dto.manageDTO;

public interface CompCheckDAO {
	
	// 구매처 추가 dto매핑
	public void purchasecompadd(PurchaseCompDTO purchcompdto) throws Exception;

	// 구매정보 추가 dto매핑
	public void purchpdtadd(PurChasePdtDTO purchpdtdto) throws Exception;
	
	// 구매처 정보 조회 dto매핑
	public List<PurchaseCompDTO> purchcompbyid(Long purchase_id) throws Exception;
	
	// 구매 정보 조회 dto매핑
	public List<PurChasePdtDTO> purchlistbyid(Long purchase_id) throws Exception;
	
	// 고객사 추가 dto매핑
	public void clientadd(ClientDTO clientdto) throws Exception;
	
	// 판매정보 추가 dto매핑
	public void selladd(SellpdtDTO sellpdtdto) throws Exception;
	
	// 기계정보 추가 dto매핑
	public void machineadd(MachineDTO machinedto) throws Exception;
	
	// 고객사 정보 조회 dto매핑
	public List<ClientDTO> clientbyid(Long client_id) throws Exception;
	
	// 기계 정보 조회 dto매핑
	public List<MachineDTO> machinebyid(Long client_id) throws Exception;

}
