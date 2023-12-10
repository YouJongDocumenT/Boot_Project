package com.bando.service;

import java.util.List;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.StockListDTO;

public interface StockService {

	// 재고 조회
	public List<StockListDTO> StockList() throws Exception;
	
	// 재고 추가
	public void AddStock(String PurchaseCompany) throws Exception;
		
}
