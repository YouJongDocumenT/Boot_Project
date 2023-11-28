package com.bando.dao;

import java.util.List;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
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
	
	
	
	
}
