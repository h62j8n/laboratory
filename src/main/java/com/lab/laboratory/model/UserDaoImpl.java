package com.lab.laboratory.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SqlSession sqlSession;
	
	// 로그인처리 및 해당 회원정보출력
	@Override
	public ProfileVo login(LoginVo login) {
		return sqlSession.selectOne("user.login", login);
	}
}
