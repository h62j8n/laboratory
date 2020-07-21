package com.lab.laboratory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

public interface UserService {

	public ProfileVo login(HttpServletRequest request, HttpServletResponse response, LoginVo login);

	void logout(HttpServletRequest request, HttpServletResponse response);

	void joinNormal(Model model, ProfileVo join);

}
