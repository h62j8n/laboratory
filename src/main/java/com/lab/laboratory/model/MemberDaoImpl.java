package com.lab.laboratory.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession sqlSession;
	
	// �α���ó�� �� �ش� ȸ���������
	@Override
	public ProfileVo login(LoginVo login) {
		return sqlSession.selectOne("member.login", login);
	}
}
