package com.yanzi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.Car;
import com.yanzi.dao.CarMapper;

@Service
public class ICarImpl implements ICar {

	@Autowired
	CarMapper carMapper;

	@Override
	public void addUserCar(Car c) {
		carMapper.addUserCar(c);
	}

	@Override
	public Car findByIdUserCar(int gid, String uid) {
		Car c = carMapper.findByIdUserCar(gid, uid);
		return c;
	}

	@Override
	public void updateUserCar(int cid, int cnum) {
		carMapper.updateUserCar(cid, cnum);
	}

	@Override
	public List<Car> findAllUserCar(String uid) {
		List<Car> list = carMapper.findAllUserCar(uid);
		return list;
	}

	@Override
	// 批量删除
	public void delAllUserCar(String[] cid) {
		carMapper.delAllUserCar(cid);
	}
	
	// 删除
	@Override
	public void delUserCar(int cid){
		carMapper.delUserCar(cid);
	}

	@Override
	// 提交订单前的查询
	public List<Car> findReadyOrders(@Param("arr") String[] cid) {
		List<Car> list = carMapper.findReadyOrders(cid);
		return list;
	}

	@Override
	public void updateCar(Car car){
		carMapper.updateCar(car);
	}
}
