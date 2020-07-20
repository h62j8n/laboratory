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
	
	// ·Î±×ÀÎ ºä
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	// ·Î±×ÀÎ Ã³¸®
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public @ResponseBody ProfileVo login(HttpServletRequest req, HttpServletResponse resp, LoginVo login) {
		ProfileVo user = userService.login(req, resp, login);
		
		return user;
	}
	
	// ·Î±×¾Æ¿ô ºä
	@RequestMapping(value = "layer/logout", method = RequestMethod.GET)
	public String logout() {
		return "user/layer/logout";
	}
	
	// ·Î±×¾Æ¿ô Ã³¸®
	@RequestMapping(value = "layer/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest req, HttpServletResponse resp) {
		userService.logout(req, resp);
		
		return "index";
	}
}
