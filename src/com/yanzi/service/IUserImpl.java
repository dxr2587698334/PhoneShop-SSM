package com.yanzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.User;
import com.yanzi.dao.UserMapper;

@Service // 表示这个类是一个service
public class IUserImpl implements IUser {

	// 注入mapper
	@Autowired
	UserMapper userMapper;

	@Override
	public User login(String uid, String upwd) {
		User user = userMapper.login(uid, upwd);
		return user;
	}

	// 查询所有用户（用户管理）
	@Override
	public List<User> findAllUser() {
		List<User> list = userMapper.findAllUser();
		return list;
	}

	// 修改角色(查询单个用户)
	@Override
	public User findByIdUser(String uid) {
		User user = userMapper.findByIdUser(uid);
		return user;
	}
	
	@Override
	// 修改信息后的查询
	public User findByIdUser2(String uid){
		User user = userMapper.findByIdUser2(uid);
		return user;
	}
	
	@Override
	public void updateUserRole(int role_rid,String uid){
		userMapper.updateUserRole(role_rid, uid);
	}
	
	@Override
	public int updateUserRole2(int role_rid){
		int i = userMapper.updateUserRole2(role_rid);
		return i;
	}
	
	@Override
	public void updateUserInfo(User user){
		userMapper.updateUserInfo(user);
	}
	
	@Override
	public void addUser(User user){
		userMapper.addUser(user);
	}

}
