package com.bando.dao;

import java.util.List;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.StockListDTO;

public interface StockDAO {
	
	// 재고 조회 dto매핑
	public List<StockListDTO> StockList() throws Exception;
	
	// 재고 추가 dto매핑
	public void AddStock(String PurchaseCompany) throws Exception;
		
}
