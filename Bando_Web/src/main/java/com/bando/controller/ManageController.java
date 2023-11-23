package com.bando.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bando.dto.BoardDTO;
import com.bando.service.BoardService;



@Controller
public class ManageController {


	// 재고관리 화면 매핑
	@GetMapping("/IOmanage")
	public String MainPage() {
		return "management/IOmanage";
	}
}
