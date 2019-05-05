package com.yanzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanzi.bean.Car;
import com.yanzi.bean.Goods;

public interface CarMapper {
	
	public void addUserCar(Car c);
	
	public Car findByIdUserCar(@Param("gid")int gid,@Param("uid")String uid);
	
	public void updateUserCar(@Param("cid")int cid,@Param("cnum")int cnum);
	
	public List<Car> findAllUserCar(String uid);
	
	//批量删除
	public void delAllUserCar(@Param("arr")String[] cid);

	//删除
	public void delUserCar(int cid);
	
	public List<Car> findReadyOrders(@Param("arr")String[] cid);
	
	public void updateCar(Car car);

}
