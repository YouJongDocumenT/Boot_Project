package com.bando.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bando.dto.PruchCommonDTO;
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
	public String purchaseproductlist(@RequestParam("purchase_id") Long purchase_id, Model model) throws Exception {
		logger.info("purchasecompany");
		
		System.out.println(purchase_id);
		
		model.addAttribute("purchase_id", purchase_id);
		
		// purchase_id에 매칭된 구매처 정보 호출
		model.addAttribute("purchcompbyid", ccs.purchcompbyid(purchase_id));
		logger.info("구매처 정보 매칭");
		
		List<PurchaseCompDTO> pccdto = ccs.purchcompbyid(purchase_id); // 가정: PurchaseCompDTO 객체 리스트 반환
		String PurchaseCompany = pccdto.get(0).getPurchase_company();
		model.addAttribute("PurchaseCompany", PurchaseCompany);

		
		// purchase_id에 매칭된 구매처 구매 정보 호출
		model.addAttribute("purchlistbyid", ccs.purchlistbyid(purchase_id));
		logger.info("구매 정보 매칭");
		
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
