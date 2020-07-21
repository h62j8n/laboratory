package com.lab.laboratory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.lab.laboratory.model.UserDaoImpl;
import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDaoImpl userDao;
	
	/* ================================================================================
	 * 로그인
	 * ================================================================================ */
	@Override
	public ProfileVo login(HttpServletRequest request, HttpServletResponse response, LoginVo login) {
		ProfileVo user = new ProfileVo();
		user = userDao.login(login);
		if (user.getLogin() != 0) {
			HttpSession session = request.getSession();
			session.setAttribute("login", user);
		}
		return user;
	}

	/* ================================================================================
	 * 로그아웃
	 * ================================================================================ */
	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
	}
	
	/* ================================================================================
	 * 회원가입
	 * ================================================================================ */
	@Override
	public void joinNormal(Model model, ProfileVo join) {
		//userDao.joinNormal(join);
		model.addAttribute("join", join);
		System.out.println(join);
	}
}
