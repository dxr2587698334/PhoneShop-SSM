package com.yanzi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanzi.bean.User;

public interface IUser {

	// 登录
	public User login(String uid, String upwd);

	// 查询所有用户（用户管理）
	public List<User> findAllUser();

	// 修改角色(查询单个用户)
	public User findByIdUser(String uid);
	
	// 修改信息后的查询
	public User findByIdUser2(String uid);
	
	public void updateUserRole(int role_rid,String uid);

	public int updateUserRole2(int role_rid);
	
	public void updateUserInfo(User user);
	
	public void addUser(User user); 

}
