package com.bando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginSignupController {
	
	@RequestMapping("/vip")
	public String vip(Model model) {
		System.out.println("VIP");
		return "vip";
	}
	
	@RequestMapping("/admin")
	public String admin(Model model) {
		return "admin";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "member/LoginForm";
	}
}
