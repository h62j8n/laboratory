package com.lab.laboratory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

public interface MemberService {

	public ProfileVo login(HttpServletRequest req, HttpServletResponse resp, LoginVo login);

}
