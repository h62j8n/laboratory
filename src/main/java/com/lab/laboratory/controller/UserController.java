package com.lab.laboratory.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;
import com.lab.laboratory.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	UserService userService;
	
	// 로그인 뷰
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	// 로그인 처리
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public @ResponseBody ProfileVo login(HttpServletRequest request, HttpServletResponse response, LoginVo login) {
		ProfileVo user = userService.login(request, response, login);
		
		return user;
	}
	
	// 로그아웃 뷰
	@RequestMapping(value = "layer/logout", method = RequestMethod.GET)
	public String logout() {
		return "user/layer/logout";
	}
	
	// 로그아웃 처리
	@RequestMapping(value = "layer/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		userService.logout(request, response);
		String referer = request.getHeader("referer");
		return "redirect:"+referer;
	}
	
	// 회원가입 뷰
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String signin() {
		return "user/join";
	}

	// 회원가입
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String signin(Model model, ProfileVo join) {
		userService.joinNormal(model, join);
		
		return "index";
	}
}
