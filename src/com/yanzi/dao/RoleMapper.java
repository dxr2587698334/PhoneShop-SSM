package com.yanzi.dao;

import java.util.List;

import com.yanzi.bean.Role;

public interface RoleMapper {
	
	public List<Role> findAllRole();
	
	public void addRole(Role role);
	
	public int getLastID();
	
	public Role findByIdRole(int r_id);
	
	public int updateRole(Role role);
	
	public int delRole(int r_id);

}
