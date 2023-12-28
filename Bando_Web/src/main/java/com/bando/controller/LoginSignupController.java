package com.bando.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bando.service.SignUpService;

@Controller
public class LoginSignupController {
	
	@Autowired
	SignUpService signUpService;
	
	@RequestMapping("/vip")
	public String vip(HttpServletRequest request, Model model, Authentication authentication) {
		WebAuthenticationDetails wDetails = (WebAuthenticationDetails) authentication.getDetails();
		String ipAddress = wDetails.getRemoteAddress();
		request.setAttribute("ipAddress", ipAddress);
		return "vip";
	}
	
	@RequestMapping("/admin")
	public String admin(HttpServletRequest request, Model model, Authentication authentication) {
		WebAuthenticationDetails wDetails = (WebAuthenticationDetails) authentication.getDetails();
		String ipAddress = wDetails.getRemoteAddress();
		request.setAttribute("ipAddress", ipAddress);
		return "admin";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model, Authentication authentication) {
        	String uri = request.getHeader("Referer"); //이전 경로
                //이미 인증된 사용자의 로그인 페이지 접근 방지
		if(authentication!=null) return "member/duplicateLoginAlert";
        
        	//이전 경로가 로그인 관련 페이지가 아닐 경우에만 저장, 속성값이 null이 되면 오류가 발생하므로 이 경우도 처리한다.
		if(uri!=null && !(uri.contains("/login")||uri.contains("/login_check"))) request.getSession().setAttribute("prevPage", uri);
		return "member/LoginForm";
	}
	
        //로그인 버튼이 있는 페이지
	@RequestMapping("/loginLinkPage")
	public String loginLinkPage(Model model) {
		return "member/loginLinkPage";
	}
	
	
	
	
	
		
	@RequestMapping("/signUp")
	public String signUp(HttpServletRequest request, Model model) {
		//사용자가 입력한 정보를 파라미터로 넘김
		boolean isInserted = signUpService.insertUserInfo(request.getParameter("id"), request.getParameter("password"));
		if(isInserted) return "member/LoginForm";
		else return "member/LoginForm";
	}
	
	
	
}
