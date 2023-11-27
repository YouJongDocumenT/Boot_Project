package com.bando.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bando.dto.manageDTO;
import com.bando.service.manageService;



@Controller
public class ManageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);

	@Autowired
	manageService manageservice;

	// 재고관리 화면 및 조회 매핑
	@GetMapping("/IOmanage")
	public String productlist(Model model) throws Exception{
		logger.info("IOmanage");
		
		model.addAttribute("productlist", manageservice.productlist());
		
		return "management/IOmanage";
	}
	
	//재고 작성
	@PostMapping("/IOmanage/write")
	@ResponseBody
	public String write(manageDTO managedto) throws Exception{
		
		System.out.println("manageDTO: " + managedto);
		logger.info("write");
		
		manageservice.productwrite(managedto);
		
		return "YES";
	}
	
	// 재고 수정
	@PostMapping("/IOmanage/updatemanage")
	@ResponseBody
	public String productupdate(manageDTO managedto) throws Exception{
		
		logger.info("updatemanage");
		
		manageservice.productupdate(managedto);
		
		return "YES";
		
	}
	
	// 재고 삭제
	@PostMapping("/IOmanage/deletemanage")
	public String productdelete(HttpServletRequest request) throws Exception{
	    logger.info("deletemanage");
	    
	    String[] ajaxMsg = request.getParameterValues("valueArr");
	    if (ajaxMsg != null) {
	        for (String str : ajaxMsg) {
	            try {
	                int intValue = Integer.parseInt(str.trim());
	                manageservice.productdelete(intValue); // 정수값을 사용하여 삭제 메서드 호출
	            } catch (NumberFormatException e) {
	                // 정수로 변환할 수 없는 경우 처리
	                e.printStackTrace(); // 또는 로그 출력
	                // 오류 발생 시 어떻게 처리할지 결정
	            }
	        }
	    }
	    
	    return "redirect:/IOmanage";
	}
}
