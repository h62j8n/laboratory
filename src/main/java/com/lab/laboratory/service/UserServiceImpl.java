package com.lab.laboratory.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.laboratory.model.UserDaoImpl;
import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDaoImpl userDao;
	
	@Override
	public ProfileVo login(HttpServletRequest req, HttpServletResponse resp, LoginVo login) {
		ProfileVo user = new ProfileVo();
		System.out.println(user.getLogin());
		user = userDao.login(login);
		if (user.getLogin() != 0) {
			HttpSession session = req.getSession();
			session.setAttribute("login", user);
			System.out.println(session.getAttribute("login"));
		}
		return user;
	}
	
	@Override
	public void logout(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.invalidate();
//		Cookie[] userCookies = req.getCookies();
//	    for(int i=0; i<userCookies.length; i++) {
//	         userCookies[i].setMaxAge(0);
//	         userCookies[i].setPath("/");
//	         resp.addCookie(userCookies[i]);
//	    }
	}
}
