package com.lab.laboratory.model.entity;

import java.sql.Date;
import java.util.List;

public class ProfileVo {
	private List<ProfileVo> profileList;
	private int mbnum;					// 회원번호(pk)
	private String mbid;				// 회원 아이디
	private String mbpw;				// 회원 비밀번호
	private String mbname;				// 회원 닉네임
	private Date mbdate;				// 회원 가입날짜
	private int login;					// 로그인 체크
	
	public ProfileVo() {}
	
	public ProfileVo(List<ProfileVo> profileList, int mbnum, String mbid, String mbpw, String mbname, Date mbdate, int login) {
		super();
		this.profileList = profileList;
		this.mbnum = mbnum;
		this.mbid = mbid;
		this.mbpw = mbpw;
		this.mbname = mbname;
		this.mbdate = mbdate;
		this.login = login;
	}
	
	public List<ProfileVo> getprofileList() {
		return profileList;
	}
	public void setprofileList(List<ProfileVo> profileList) {
		this.profileList = profileList;
	}
	public int getMbnum() {
		return mbnum;
	}
	public void setMbnum(int mbnum) {
		this.mbnum = mbnum;
	}
	public String getMbid() {
		return mbid;
	}
	public void setMbid(String mbid) {
		this.mbid = mbid;
	}
	public String getMbpw() {
		return mbpw;
	}
	public void setMbpw(String mbpw) {
		this.mbpw = mbpw;
	}
	public String getMbname() {
		return mbname;
	}
	public void setMbname(String mbname) {
		this.mbname = mbname;
	}
	public Date getMbdate() {
		return mbdate;
	}
	public void setMbdate(Date mbdate) {
		this.mbdate = mbdate;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "ProfileVo [profileList=" + profileList + ", mbnum=" + mbnum + ", mbid=" + mbid + ", mbpw=" + mbpw
				+ ", mbname=" + mbname + ", mbdate=" + mbdate + ", login=" + login + "]";
	}
}
