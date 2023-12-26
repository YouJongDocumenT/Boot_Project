package com.bando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

	
	// 메인화면 매핑
	@GetMapping("/bando")
	public String Bando() {
		return "/bando";
	}
	
	// 메인페이지
	@GetMapping("/main")
	public String MainPage() throws Exception {
		
		return "mainpage/index";
	}
	
	// About페이지(페이지 결정시 이름 변경 필수)
	@GetMapping("/about")
	public String AboutPage() throws Exception {
		
		return "mainpage/subpage/about";
	}
	
	// courses페이지(페이지 결정시 이름 변경 필수)
	@GetMapping("/courses")
	public String CoursesPage() throws Exception {

		return "mainpage/subpage/courses";
	}
	
	// contact페이지(페이지 결정시 이름 변경 필수)
	@GetMapping("/contact")
	public String ContactPage() throws Exception {
		
		return "mainpage/subpage/contact";
	}

	// team페이지(페이지 결정시 이름 변경 필수)
	@GetMapping("/team")
	public String Team() throws Exception {
		
		return "mainpage/subpage/team";
	}
	
	// testimonial페이지(페이지 결정시 이름 변경 필수)
	@GetMapping("/testimonial")
	public String Testimonial() throws Exception {
		
		return "mainpage/subpage/testimonial";
	}
	
	// 404페이지(페이지 결정시 이름 변경 필수)
	@GetMapping("/404")
	public String FzF() throws Exception {
		
		return "mainpage/subpage/404";
	}
	
	
	
}
