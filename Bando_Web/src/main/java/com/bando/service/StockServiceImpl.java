package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.StockDAO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.StockListDTO;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	private StockDAO std;
	
	// 재고 조회
	@Override
	public List<StockListDTO> StockList() throws Exception {
		return std.StockList();
	}
	
	// 재고 추가
	@Override
	public void AddStock(String PurchaseCompany) throws Exception {
		std.AddStock(PurchaseCompany);
	}

}
