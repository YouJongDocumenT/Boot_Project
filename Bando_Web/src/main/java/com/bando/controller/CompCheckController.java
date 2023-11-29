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

import com.bando.dto.ClientDTO;
import com.bando.dto.MachineDTO;
import com.bando.dto.PruchCommonDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SellpdtDTO;
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
		
		// purchase_id에 매칭된 구매처 이름만 리스트에서 빼오는 로직
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
	
	
	
	// 고객사 추가
	@PostMapping("/purchasecompany/addClient")
	@ResponseBody
	public String AddClient(ClientDTO clientdto) throws Exception {

		System.out.println("ClientDTO: " + clientdto);
		logger.info("add");
		// 구매처 추가
		ccs.clientadd(clientdto);
		return "YES";
	}
	
	
	// 고객사 화면단
	@GetMapping("/clientcompany")
	public String clientproductlist(@RequestParam("client_id") Long client_id, Model model) throws Exception {
		logger.info("purchasecompany");

		System.out.println("client_id : "+client_id);

		model.addAttribute("client_id", client_id);
		
		// client_id에 매칭된 고객사 정보 가져옴
		model.addAttribute("clientbyid", ccs.clientbyid(client_id));
		logger.info("고객사 정보 매칭");

		// purchase_id에 매칭된 고객사 이름만 리스트에서 빼오는 로직
		List<ClientDTO> pccdto = ccs.clientbyid(client_id); // 가정: PurchaseCompDTO 객체 리스트 반환
		String clientCompany = pccdto.get(0).getClient_company();
		model.addAttribute("clientCompany", clientCompany);
		
		// client_id에 매칭된 기계 정보 가져옴
		model.addAttribute("machinebyid", ccs.machinebyid(client_id));
		logger.info("고객사 정보 매칭");
		
		// client_id에 매칭된 기계 이름과 id값만 리스트에서 빼오는 로직
		List<MachineDTO> mcdto = ccs.machinebyid(client_id); // 가정: PurchaseCompDTO 객체 리스트 반환
		String machine_name = mcdto.get(0).getMachine_name();
		int machine_id = mcdto.get(0).getMachine_id();
		model.addAttribute("machine_name", machine_name);
		model.addAttribute("machine_id", machine_id);
		
		// machine_id에 매칭된 고객사 판매 정보 호출
		model.addAttribute("sellListbyid", ccs.sellListbyid(machine_id));
		logger.info("구매 정보 매칭");

		return "management/clientcompany";
	}
	
	// 판매정보 추가
	@PostMapping("/clientcompany/selladd")
	@ResponseBody
	public String AddSell(SellpdtDTO sellpdtdto) throws Exception {

		System.out.println("SellpdtDTO: " + sellpdtdto);
		logger.info("add");
		// 구매처 추가
		ccs.selladd(sellpdtdto);
		return "YES";
	}
		
	// 기계정보 추가
	@PostMapping("/clientcompany/machineadd")
	@ResponseBody
	public String machineAdd(MachineDTO machinedto) throws Exception {

		System.out.println("MachineDTO: " + machinedto);
		logger.info("add");
		// 구매처 추가
		ccs.machineadd(machinedto);
		return "YES";
	}
		

}
