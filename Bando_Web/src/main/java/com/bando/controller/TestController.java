package com.bando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/purchase")
	public String purchase_view() {
		return"StockView/PurManage";
	}
	@GetMapping("/registerpurchase")
	public String registerpurchase_view() {
		return"StockView/registerPurchase";
	}
	
	
	@GetMapping("/sell")
	public String sell_view() {
		return"StockView/SellManage";
	}
	@GetMapping("/stock")
	public String stock_view() {
		return"StockView/StockManage";
	}

}
