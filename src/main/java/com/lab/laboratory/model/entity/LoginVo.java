package com.lab.laboratory.model.entity;

import java.sql.Date;
import java.util.List;

public class LoginVo {
	private String userId;				// ȸ�� ���̵�
	private String userPw;				// ȸ�� ��й�ȣ
	
	public LoginVo() {}
	
	public LoginVo(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "LoginVo [userId=" + userId + ", userPw=" + userPw + "]";
	}
}
