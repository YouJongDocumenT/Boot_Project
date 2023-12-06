package com.bando.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.bando.dto.Criteria;
import com.bando.dto.MachineDTO;
import com.bando.dto.PageMaker;
import com.bando.dto.PruchCommonDTO;
import com.bando.dto.PurChasePdtDTO;
import com.bando.dto.PurchaseCompDTO;
import com.bando.dto.SellAllDataDTO;
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
	public String purchaseproductlist(@RequestParam("purchase_id") Long purchase_id, Criteria cri, Model model) throws Exception {
		
		logger.info("purchasecompany");
		
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
		
		System.out.println(purchase_id);
		
		model.addAttribute("purchase_id", purchase_id);
		
		// purchase_id에 매칭된 구매처 정보 호출
		model.addAttribute("purchcompbyid", ccs.purchcompbyid(purchase_id));
		logger.info("구매처 정보 매칭");
		
		// purchase_id에 매칭된 구매처 이름만 리스트에서 빼오는 로직
		List<PurchaseCompDTO> pccdto = ccs.purchcompbyid(purchase_id); // 가정: PurchaseCompDTO 객체 리스트 반환
		String PurchaseCompany = pccdto.get(0).getPurchase_company();
		model.addAttribute("PurchaseCompany", PurchaseCompany);
		logger.info("매칭된 이름 리스트로 출력");
		
		// purchase_id에 매칭된 구매처 구매 정보 호출
		System.out.println(cri);
		model.addAttribute("purchlistbyid", ccs.purchlistbyid(purchase_id, cri));
		logger.info("구매 정보 매칭");
		
		// 페이징
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(ccs.listCount());
		
		model.addAttribute("pageMaker", pageMaker);
		logger.info("페이징");
		
		
		// 회사정보 조회
		model.addAttribute("PurchCompInfo", ccs.PurchCompInfo(purchase_id));
		logger.info("회사 정보 출력");
		
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
	
	// 구매처 구매 정보 수정
	@PostMapping("/purchasecompany/update")
	@ResponseBody
	public String SellDetailUpdate(PurChasePdtDTO puchpdtdto) throws Exception {

		System.out.println("PurChasePdtDTO: " + puchpdtdto);
		logger.info("updatemanage");

		ccs.SellDetailUpdate(puchpdtdto);

		return "YES";

	}
	
	
	// 고객사 화면단
	@GetMapping("/clientcompany")
	public String clientproductlist(@RequestParam("client_id") Long client_id, Model model) throws Exception {
		
		logger.info("purchasecompany");
		
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
		
		// client_id에 매칭된 기계정보 가져옴
		model.addAttribute("machinelist", ccs.machinebyid(client_id));
		
		model.addAttribute("machine_name", machine_name);
		model.addAttribute("machine_id", machine_id);
		
		// client_id에 매칭된 고객사 판매 정보 호출
		model.addAttribute("sellListbyid", ccs.sellListbyid(client_id));
		logger.info("구매 정보 매칭");
		
		// client_id에 매칭된 모든 판매 정보 호출
		Map<Integer, List<SellAllDataDTO>> sellAllDataMap = new HashMap<Integer, List<SellAllDataDTO>>();

		for (int i = 0; i < mcdto.size(); i++) {
		    int machineList_id = mcdto.get(i).getMachine_id();
		    List<SellAllDataDTO> sellAllData = ccs.sellAlldata(client_id, machineList_id);
		    
		    sellAllDataMap.put(machineList_id, sellAllData);
		    
		    System.out.println("아이디 : " + sellAllData);
		    logger.info("구매 정보 매칭 : " + i);
		}

		// SellAllDataDTO 형식의 리스트를 생성합니다.
		List<SellAllDataDTO> sellAllDataList = new ArrayList<SellAllDataDTO>();

		// sellAllDataMap에서 값들을 가져와서 리스트에 추가합니다.
		for (Map.Entry<Integer, List<SellAllDataDTO>> entry : sellAllDataMap.entrySet()) {
		    List<SellAllDataDTO> sellAllData = entry.getValue();
		    
		    // sellAllData가 null이 아니고 비어 있지 않은 경우에만 리스트에 추가합니다.
		    if (sellAllData != null && !sellAllData.isEmpty()) {
		        sellAllDataList.addAll(sellAllData);
		    }
		}
		model.addAttribute("sellAllDataList", sellAllDataList);

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
	
	// 고객사 판매 정보 수정
	@PostMapping("/clientcompany/update")
	@ResponseBody
	public String SellAllDataUpdate(SellAllDataDTO sellalldatadto) throws Exception {

		System.out.println("SellAllDataDTO: " + sellalldatadto);
		logger.info("updatemanage");

		ccs.SellAllDataUpdate(sellalldatadto);

		return "YES";

	}
	
	
	// 구매정보 삭제
	@PostMapping("/purchasecompany/delete")
	@ResponseBody
	public String PurchaseDataDelete(HttpServletRequest request) throws Exception {
		logger.info("delete_purchasecompany");

		String[] ajaxMsg = request.getParameterValues("valueArr");
		if (ajaxMsg != null) {
			for (String str : ajaxMsg) {
				try {
					int intValue = Integer.parseInt(str.trim());
					ccs.PurchaseDataDelete(intValue); // 정수값을 사용하여 삭제 메서드 호출
				} catch (NumberFormatException e) {
					// 정수로 변환할 수 없는 경우 처리
					e.printStackTrace(); // 또는 로그 출력
					// 오류 발생 시 어떻게 처리할지 결정
				}
			}
		}

		return "YES";
	}
	
	// 판매정보 삭제
	@PostMapping("/clientcompany/delete")
	@ResponseBody
	public String ClientDataDelete(HttpServletRequest request) throws Exception {
		logger.info("delete_purchasecompany");

		String[] ajaxMsg = request.getParameterValues("valueArr");
		if (ajaxMsg != null) {
			for (String str : ajaxMsg) {
				try {
					int intValue = Integer.parseInt(str.trim());
					ccs.ClientDataDelete(intValue); // 정수값을 사용하여 삭제 메서드 호출
				} catch (NumberFormatException e) {
					// 정수로 변환할 수 없는 경우 처리
					e.printStackTrace(); // 또는 로그 출력
					// 오류 발생 시 어떻게 처리할지 결정
				}
			}
		}

		return "YES";
	}
		

}
