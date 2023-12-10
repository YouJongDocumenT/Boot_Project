package com.bando.service;

import java.util.List;

import com.bando.dto.StockListDTO;

public interface StockService {

	// 재고 조회
	public List<StockListDTO> StockList() throws Exception;
		
}
