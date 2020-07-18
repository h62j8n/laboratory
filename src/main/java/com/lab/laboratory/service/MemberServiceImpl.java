package com.lab.laboratory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.laboratory.model.MemberDaoImpl;
import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDaoImpl memberDao;
	
	@Override
	public ProfileVo login(HttpServletRequest req, HttpServletResponse resp, LoginVo login) {
		ProfileVo user = memberDao.login(login);
		if (user.getLogin() != 0) {
			HttpSession session = req.getSession();
			session.setAttribute("login", user);
			System.out.println(user.toString());
		}
		return user;
	}
}
