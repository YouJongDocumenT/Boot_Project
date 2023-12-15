package com.bando.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bando.service.StockService;

@Controller
public class StockManageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);

	@Autowired
	StockService sts;
	
	// 재고 내역 화면단
	@GetMapping("/StockList")
	public String StockList(Model model) throws Exception {
		
		logger.info("StockList");
		// 구매한 제품 데이터 모델 등록
		model.addAttribute("StockList", sts.StockList());

		return "management/StockList";
	}

}
