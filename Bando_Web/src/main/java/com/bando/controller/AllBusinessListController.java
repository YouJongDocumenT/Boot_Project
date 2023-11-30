package com.bando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllBusinessListController {

	
	// 총 구매 내역 화면단
	@GetMapping("PurChaseList")
	public String AllPruChaseList() {	
		
		return "management/PurChaseList";
	}
	
	// 총 판매 내역 화면단
	@GetMapping("SellList")
	public String AllSellList() {

		return "management/SellList";
	}
	
	
	// 재고 내역 화면단
	@GetMapping("StockList")
	public String AllStockList() {
		
		return "management/StockList";
	}
}
