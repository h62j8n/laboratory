package com.lab.laboratory.model;

import com.lab.laboratory.model.entity.LoginVo;
import com.lab.laboratory.model.entity.ProfileVo;

public interface MemberDao {

	ProfileVo login(LoginVo login);

}
