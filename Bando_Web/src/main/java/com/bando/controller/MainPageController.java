package com.bando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

	
	// 메인화면 매핑
	@GetMapping("/bando")
	public String MainPage() {
		return "/bando";
	}
	
}
