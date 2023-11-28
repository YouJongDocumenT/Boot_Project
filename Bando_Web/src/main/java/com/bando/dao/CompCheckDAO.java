package com.bando.dao;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;

public interface CompCheckDAO {
	
	// 구매처 추가 dto매핑
	public void purchasecompadd(PurchaseCompDTO purchcompdto) throws Exception;

	// 구매정보 추가 dto매핑
	public void purchpdtadd(PurChasePdtDTO purchpdtdto) throws Exception;
	
	
	
	
}
