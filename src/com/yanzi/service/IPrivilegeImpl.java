package com.yanzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.Privilege;
import com.yanzi.dao.PrivilegeMapper;

@Service
public class IPrivilegeImpl implements IPrivilege {

	@Autowired
	PrivilegeMapper privilegeMapper;
	
	@Override
	public List<Privilege> findUserPrivilege(String uid) {
		List<Privilege> list = privilegeMapper.findUserPrivilege(uid);
		return list;
	}
	
	@Override
	public List<Privilege> findAllPrivilege(){
		List<Privilege> list = privilegeMapper.findAllPrivilege();
		return list;
	}

}
