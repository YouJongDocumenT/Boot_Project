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
import com.bando.service.StockService;
import com.bando.service.manageService;

@Controller
public class AllBusinessListController {

	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);
	
	@Autowired
	CompCheckService ccs;
	
	@Autowired
	StockService sts;
	
	@Autowired
	manageService manageservice;
	
	// 총 구매 내역 화면단
	@GetMapping("PurChaseList")
	public String AllPruChaseList(Model model, Criteria cri) throws Exception {
		
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
		
		// 각 구매 관련 테이블의 purchase_id에 매칭된 모든데이터 출력
		model.addAttribute("PurChaseMachingDataList", ccs.PurChaseMachingDataList(cri));
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(ccs.listCount());

		model.addAttribute("pageMaker", pageMaker);
		logger.info("페이징");
		
		logger.info("구매처 정보 매칭");
		
		// 총액 테이블 모델 등록
		model.addAttribute("PriceList", sts.PriceList());
		logger.info("총액테이블 호출");
		
		return "management/PurChaseList";
	}
	
	// 총 판매 내역 화면단
	@GetMapping("SellList")
	public String AllSellList(Model model, Criteria cri) throws Exception {
		
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
				
				
		
		// 각 판매 관련 테이블의 client_id및 machine_id에 매칭된 모든데이터 출력
		model.addAttribute("SellMachingDataList", ccs.SellMachingDataList(cri));
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(ccs.SelllistCount());

		model.addAttribute("pageMaker", pageMaker);
		logger.info("페이징");
				
		logger.info("판매 정보 매칭");
		
		// 총액 테이블 모델 등록
		model.addAttribute("PriceList", sts.PriceList());
		logger.info("총액테이블 호출");

		return "management/SellList";
	}
	
	
}
