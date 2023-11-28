package com.bando.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.CompCheckDAO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;

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
	
	
	
}
