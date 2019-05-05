package com.yanzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.Role;
import com.yanzi.dao.RoleMapper;

@Service
public class IRoleImpl implements IRole {
	
	@Autowired
	RoleMapper roleMapper;

	@Override
	public List<Role> findAllRole() {
		List<Role> list = roleMapper.findAllRole();
		return list;
	}
	
	@Override
	public void addRole(Role role){
		roleMapper.addRole(role);
	}
	
	@Override
	public int getLastID(){
		int id = roleMapper.getLastID();
		return id;
	}

	@Override
	public Role findByIdRole(int r_id) {
		Role role = roleMapper.findByIdRole(r_id);
		return role;
	}
	
	@Override
	public int updateRole(Role role){
		int i = roleMapper.updateRole(role);
		return i;
	}
	
	@Override
	public int delRole(int r_id){
		int i = roleMapper.delRole(r_id);
		return i;
	}

}
