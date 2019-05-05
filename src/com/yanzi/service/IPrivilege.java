package com.yanzi.service;

import java.util.List;

import com.yanzi.bean.Privilege;

public interface IPrivilege {
	
	public List<Privilege> findUserPrivilege(String uid);
	
	public List<Privilege> findAllPrivilege();

}
