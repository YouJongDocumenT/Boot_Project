package com.bando.dao;

import java.util.List;

import com.bando.dto.PriceDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.SellpdtDTO;
import com.bando.dto.StockListDTO;

public interface StockDAO {
	
	// 재고 조회 dto매핑
	public List<StockListDTO> StockList() throws Exception;
	
	// 재고 추가 dto매핑
	public void AddStock(String PurchaseCompany) throws Exception;
	
	// 구매금액 총액테이블에 추가
	public void allpurchcnt() throws Exception;
	
	// 구매-> 재고금액 총액테이블에 추가
	public void stock_price() throws Exception;
		
	// 판매금액 총액테이블에 추가
	public void allsellcnt() throws Exception;
	
	// 순수익 총액테이블에 추가
	public void revenue() throws Exception;

	// 재고수량 카운트 감소
	public void St_Quantity_Cnt() throws Exception;
	
	// 재고수량이 0일시 재고 열 삭제
	public void DeleteStock() throws Exception;

	// 재고금액 변경
	public void ChangeStockValue() throws Exception;

	// 총액테이블 호출
	public List<PriceDTO> PriceList() throws Exception;
	
	// 세금 총액테이블에 추가
	public List<PriceDTO> tax() throws Exception;
	
	// purchase_id에 매칭된 총액 출력
	public List<PurChasePdtDTO> PurChasePdtById(Long purchase_id) throws Exception;
		
	// client_id에 매칭된 총액 출력
	public List<SellpdtDTO> SellPdtById(Long client_id) throws Exception;
		
}



