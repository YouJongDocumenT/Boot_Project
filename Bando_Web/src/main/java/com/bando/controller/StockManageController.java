package com.bando.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bando.dto.PageMaker;
import com.bando.dto.SearchCriteria;
import com.bando.service.StockService;
import com.bando.service.manageService;

@Controller
public class StockManageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);

	@Autowired
	StockService sts;
	
	@Autowired
	manageService manageservice;
	
	// 재고 내역 화면단
	@GetMapping("/StockList")
	public String StockList(Model model, @ModelAttribute("scri") SearchCriteria scri) throws Exception {
		
		logger.info("StockList");
		
		// 예시로 model 객체가 null이거나 manageservice가 초기화되지 않았을 경우
		if (model != null && manageservice != null) {
			// 사이드바 구매처 리스트 호출
			model.addAttribute("purchasecomplist", manageservice.purchasecomplist());
			// 사이드바 고객사 리스트 호출
			model.addAttribute("clientlist", manageservice.clientlist());
		} else {
			// 모델이나 manageservice가 null인 경우 예외 처리
			// 예: 로그 기록 또는 적절한 예외 처리
			logger.error("Model or ManageService is null");
			// 예외 상황에 대한 처리 추가
		}
		
		// 총액 테이블 모델 등록
		model.addAttribute("PriceList", sts.PriceList());
		logger.info("총액테이블 호출");
		
		// 구매한 제품 데이터 모델 등록
		model.addAttribute("StockList", sts.StockList_P(scri));
		logger.info("재고테이블 호출");
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(scri);
		pageMaker.setTotalCount(sts.StockListCount(scri));

		model.addAttribute("pageMaker", pageMaker);
		logger.info("페이징");
		
		return "management/StockList";
	}

}


