package com.yanzi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanzi.bean.Car;

public interface ICar {

	public void addUserCar(Car c);

	public Car findByIdUserCar(int gid, String uid);

	public void updateUserCar(int cid, int cnum);

	public List<Car> findAllUserCar(String uid);

	// 批量删除
	public void delAllUserCar(String[] cid);
	
	// 删除
	public void delUserCar(int cid);

	// 提交订单前的查询
	public List<Car> findReadyOrders(@Param("arr") String[] cid);
	
	public void updateCar(Car car);

}
