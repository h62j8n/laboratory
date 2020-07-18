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
import com.lab.laboratory.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	// �α��� ������
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "member/login";
	}
	
	// �α��� ó��
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public @ResponseBody ProfileVo login(HttpServletRequest req, HttpServletResponse resp, LoginVo login) {
		ProfileVo user = memberService.login(req, resp, login);
		
		return user;
	}
	
	// �α׾ƿ�
	/*
	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest req,HttpServletResponse resp) {
		memberService.logout(req,resp);
		
		return "index";
	}
	*/
}
