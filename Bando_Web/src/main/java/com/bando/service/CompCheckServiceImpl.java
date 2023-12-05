package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.CompCheckDAO;
import com.bando.dto.AllPurchaseDataDTO;
import com.bando.dto.AllSellDataDTO;
import com.bando.dto.ClientDTO;
import com.bando.dto.MachineDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SellAllDataDTO;
import com.bando.dto.SellpdtDTO;
import com.bando.dto.manageDTO;

@Service
public class CompCheckServiceImpl implements CompCheckService{
	
	@Autowired
	CompCheckDAO ccd;
	
	// 구매처 추가
	@Override
	public void purchasecompadd(PurchaseCompDTO purchcompdto) throws Exception {
		ccd.purchasecompadd(purchcompdto);
	}

	// 구매정보 추가
	@Override
	public void purchpdtadd(PurChasePdtDTO purchpdtdto) throws Exception {
		ccd.purchpdtadd(purchpdtdto);
	}
	
	// 구매처 정보 조회
	@Override
	public List<PurchaseCompDTO> purchcompbyid(Long purchase_id) throws Exception{
		return ccd.purchcompbyid(purchase_id);
	}
	
	// 구매 정보 조회
	@Override
	public List<PurChasePdtDTO> purchlistbyid(Long purchase_id) throws Exception {
		return ccd.purchlistbyid(purchase_id);
	}
	
	// 고객사 추가
	@Override
	public void clientadd(ClientDTO clientdto) throws Exception {
		ccd.clientadd(clientdto);
	}
	
	// 판매정보 추가
	@Override
	public void selladd(SellpdtDTO sellpdtdto) throws Exception {
		ccd.selladd(sellpdtdto);
	}
	
	// 기계정보 추가
	@Override
	public void machineadd(MachineDTO machinedto) throws Exception {
		ccd.machineadd(machinedto);
	}
	
	// 고객사 정보 조회
	@Override
	public List<ClientDTO> clientbyid(Long client_id) throws Exception {
		return ccd.clientbyid(client_id);
	}
	
	// 기계 정보 조회
	@Override
	public List<MachineDTO> machinebyid(Long client_id) throws Exception {
		return ccd.machinebyid(client_id);
	}
	
	// 판매 정보 조회
	@Override
	public List<SellpdtDTO> sellListbyid(Long client_id) throws Exception {
		return ccd.sellListbyid(client_id);
	}
	
	// 종합 판매 정보 조회
	@Override
	public List<SellAllDataDTO> sellAlldata(Long client_id, int machineList_id) throws Exception {
		return ccd.sellAlldata(client_id, machineList_id);
	}
	
	// 모든 구매처 정보 조회
	@Override
	public List<AllPurchaseDataDTO> PurChaseMachingDataList() throws Exception {
		return ccd.PurChaseMachingDataList();
	}
	
	// 모든 고객사 정보 조회
	@Override
	public List<AllSellDataDTO> SellMachingDataList() throws Exception {
		return ccd.SellMachingDataList();
	}
	
	// 회사 정보 조회
	@Override
	public List<PurchaseCompDTO> PurchCompInfo(Long purchase_id) throws Exception {
		return ccd.PurchCompInfo(purchase_id);
	}

	// 구매처 구매정보 수정
	@Override
	public void SellDetailUpdate(PurChasePdtDTO puchpdtdto) throws Exception {
		ccd.SellDetailUpdate(puchpdtdto);
	}
	
}
















