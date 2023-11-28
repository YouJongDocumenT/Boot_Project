package com.bando.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.manageDTO;
import com.bando.service.CompCheckService;
import com.bando.service.manageService;

@Controller
public class CompCheckController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);
	
	@Autowired
	CompCheckService ccs;
	manageService manageservice;
	
	// 거래처 화면단
	@GetMapping("/purchasecompany")
	public String purchaseproductlist(Model model) throws Exception {
		logger.info("purchasecompany");
		
		// 구매처 모델 호출
		//model.addAttribute("purchasecomplist", manageservice.purchasecomplist());

		return "management/purchasecompany";
	}

	// 구매처 추가
	@PostMapping("/purchasecompany/add")
	@ResponseBody
	public String AddComp(PurchaseCompDTO purchcompdto) throws Exception {

		System.out.println("PurchaseCompDTO: " + purchcompdto);
		logger.info("add");
		// 구매처 추가
		ccs.purchasecompadd(purchcompdto);
		return "YES";
	}
	
	// 구매정보 추가
	@PostMapping("/purchasecompany/purchadd")
	@ResponseBody
	public String AddPurch(PurChasePdtDTO purchpdtdto) throws Exception {

		System.out.println("PurChasePdtDTO: " + purchpdtdto);
		logger.info("add");
		// 구매처 추가
		ccs.purchpdtadd(purchpdtdto);
		return "YES";
	}

}
