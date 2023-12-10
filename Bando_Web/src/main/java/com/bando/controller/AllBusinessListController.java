package com.bando.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bando.dto.Criteria;
import com.bando.dto.PageMaker;
import com.bando.service.CompCheckService;

@Controller
public class AllBusinessListController {

	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);
	
	@Autowired
	CompCheckService ccs;
	
	// 총 구매 내역 화면단
	@GetMapping("PurChaseList")
	public String AllPruChaseList(Model model, Criteria cri) throws Exception {
		
		// 각 구매 관련 테이블의 purchase_id에 매칭된 모든데이터 출력
		model.addAttribute("PurChaseMachingDataList", ccs.PurChaseMachingDataList(cri));
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(ccs.listCount());

		model.addAttribute("pageMaker", pageMaker);
		logger.info("페이징");
		
		logger.info("구매처 정보 매칭");
		
		return "management/PurChaseList";
	}
	
	// 총 판매 내역 화면단
	@GetMapping("SellList")
	public String AllSellList(Model model, Criteria cri) throws Exception {
		
		// 각 판매 관련 테이블의 client_id및 machine_id에 매칭된 모든데이터 출력
		model.addAttribute("SellMachingDataList", ccs.SellMachingDataList(cri));
		logger.info("구매처 정보 매칭");

		return "management/SellList";
	}
	
	
	// 재고 내역 화면단
	@GetMapping("StockList")
	public String AllStockList() throws Exception {
		
		return "management/StockList";
	}
	
	
	
	
}
