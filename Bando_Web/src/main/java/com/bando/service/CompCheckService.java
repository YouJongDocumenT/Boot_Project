package com.bando.service;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;

public interface CompCheckService {

	
	// 구매처 추가
	public void purchasecompadd(PurchaseCompDTO purchcompdto) throws Exception;
	
	// 구매정보 추가
	public void purchpdtadd(PurChasePdtDTO purchpdtdto) throws Exception;
		
}
