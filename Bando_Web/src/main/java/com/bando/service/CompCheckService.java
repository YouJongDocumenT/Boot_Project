package com.bando.service;

import java.util.List;

import com.bando.dto.AllPurchaseDataDTO;
import com.bando.dto.AllSellDataDTO;
import com.bando.dto.ClientDTO;
import com.bando.dto.MachineDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SellAllDataDTO;
import com.bando.dto.SellpdtDTO;
import com.bando.dto.manageDTO;

public interface CompCheckService {

	
	// 구매처 추가
	public void purchasecompadd(PurchaseCompDTO purchcompdto) throws Exception;
	
	// 구매정보 추가
	public void purchpdtadd(PurChasePdtDTO purchpdtdto) throws Exception;
	
	// 구매처 정보 조회
	public List<PurchaseCompDTO> purchcompbyid(Long purchase_id) throws Exception;
	
	// 구매 정보 조회
	public List<PurChasePdtDTO> purchlistbyid(Long purchase_id) throws Exception;
	
	
	
	// 고객사 추가
	public void clientadd(ClientDTO clientdto) throws Exception;
	
	// 판매정보 추가
	public void selladd(SellpdtDTO sellpdtdto) throws Exception;
		
	// 기계정보 추가
	public void machineadd(MachineDTO machinedto) throws Exception;
	
	// 고객사 정보 조회
	public List<ClientDTO> clientbyid(Long client_id) throws Exception;
	
	// 기계 정보 조회
	public List<MachineDTO> machinebyid(Long client_id) throws Exception;

	// 판매 정보 조회
	public List<SellpdtDTO> sellListbyid(Long client_id) throws Exception;
		
	// 종합 판매 정보 조회
	public List<SellAllDataDTO> sellAlldata(Long client_id, int machineList_id) throws Exception;
	
	// 종합 판매 정보 조회
	public List<AllPurchaseDataDTO> PurChaseMachingDataList() throws Exception;
	
	// 종합 판매 정보 조회
	public List<AllSellDataDTO> SellMachingDataList() throws Exception;
	
	// 회사 정보 조회
	public List<PurchaseCompDTO> PurchCompInfo(Long purchase_id) throws Exception;
	
	// 구매처 구매정보 수정
	public void SellDetailUpdate(PurChasePdtDTO puchpdtdto) throws Exception;
	
	// 고객사 판매정보 수정
	public void SellAllDataUpdate(SellAllDataDTO sellalldatadto) throws Exception;
	
	// 구매정보 삭제
	public void PurchaseDataDelete(int purchase_pdtnum) throws Exception;
	
	// 판매정보 삭제
	public void ClientDataDelete(int resp_id) throws Exception;
	
	
}






