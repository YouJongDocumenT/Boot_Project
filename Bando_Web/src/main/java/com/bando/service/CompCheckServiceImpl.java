package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.CompCheckDAO;
import com.bando.dto.AllPurchaseDataDTO;
import com.bando.dto.AllSellDataDTO;
import com.bando.dto.ClientDTO;
import com.bando.dto.Criteria;
import com.bando.dto.MachineDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SearchCriteria;
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
	public List<PurChasePdtDTO> purchlistbyid(Long purchase_id, SearchCriteria scri) throws Exception {
		return ccd.purchlistbyid(purchase_id, scri);
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
	public List<SellpdtDTO> sellListbyid(Long client_id, SearchCriteria scri) throws Exception {
		return ccd.sellListbyid(client_id, scri);
	}
	
	// 종합 판매 정보 조회
	@Override
	public List<SellAllDataDTO> sellAlldata(Long client_id, SearchCriteria scri) throws Exception {
		return ccd.sellAlldata(client_id, scri);
	}
	
	
	
	
	// 모든 구매처 정보 조회
	@Override
	public List<AllPurchaseDataDTO> PurChaseMachingDataList(Criteria cri) throws Exception {
		return ccd.PurChaseMachingDataList(cri);
	}
	
	// 모든 고객사 정보 조회
	@Override
	public List<AllSellDataDTO> SellMachingDataList(Criteria cri) throws Exception {
		return ccd.SellMachingDataList(cri);
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
	
	// 고객사 판매정보 수정
	@Override
	public void SellAllDataUpdate(SellAllDataDTO sellalldatadto) throws Exception {
		ccd.SellAllDataUpdate(sellalldatadto);
	}
	
	// 구매정보 삭제
	@Override
	public void PurchaseDataDelete(int purchase_pdtnum) throws Exception {
		ccd.PurchaseDataDelete(purchase_pdtnum);
	}
	
	// 판매정보 삭제
	@Override
	public void ClientDataDelete(int resp_id) throws Exception {
		ccd.ClientDataDelete(resp_id);
	}
	
	
	
	
	
	
	
	
	
	
	
	// 구매처 게시물 총 갯수
	@Override
	public int listCount(SearchCriteria scri) throws Exception {
		return ccd.listCount(scri);
	}

	// 판매처 게시물 총 갯수
	@Override
	public int SelllistCount(SearchCriteria scri) throws Exception {
		return ccd.SelllistCount(scri);
	}
	
	// 판매처 게시물 총 갯수
	@Override
	public int sellByIdListCount(SearchCriteria scri) throws Exception {
		return ccd.sellByIdListCount(scri);
	}
	
}
















