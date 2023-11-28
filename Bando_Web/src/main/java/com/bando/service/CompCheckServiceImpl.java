package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.CompCheckDAO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
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
	
}
