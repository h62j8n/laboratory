package com.lab.laboratory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

public interface UserService {

	public ProfileVo login(HttpServletRequest req, HttpServletResponse resp, LoginVo login);

	void logout(HttpServletRequest req, HttpServletResponse resp);

}
