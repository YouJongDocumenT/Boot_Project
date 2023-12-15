package com.bando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bando.dao.StockDAO;
import com.bando.dto.PriceDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.SellpdtDTO;
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
		System.out.println("asdasdasd");
		std.AddStock(PurchaseCompany);
	}
	
	// 구매금액 총액테이블에 추가
	@Override
	public void allpurchcnt() throws Exception {
		std.allpurchcnt();
	}
	
	// 구매-> 재고금액 총액테이블에 추가
	@Override
	public void stock_price() throws Exception {
		std.stock_price();
	}
	
	// 판매금액 총액테이블에 추가
	@Override
	public void allsellcnt() throws Exception {
		std.allsellcnt();
	}
	
	// 총액테이블 호출
	@Override
	public List<PriceDTO> PriceList() throws Exception {
		return std.PriceList();
	}
	
	// 세금 총액테이블에 추가
	@Override
	public List<PriceDTO> tax() throws Exception {
		return std.tax();
	}
	
	// purchase_id에 매칭된 총액 출력
	@Override
	public List<PurChasePdtDTO> PurChasePdtById(Long purchase_id) throws Exception {
		return std.PurChasePdtById(purchase_id);
	}
	
	// client_id에 매칭된 총액 출력
	@Override
	public List<SellpdtDTO> SellPdtById(Long client_id) throws Exception {
		return std.SellPdtById(client_id);
	}
	
	
}










