package com.yanzi.dao;

import java.util.List;

import com.yanzi.bean.Privilege;

public interface PrivilegeMapper {
	
	public List<Privilege> findUserPrivilege(String uid);
	
	public List<Privilege> findAllPrivilege();

}
