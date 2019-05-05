package com.yanzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanzi.bean.Orders;

public interface OrdersMapper {
	
	public void addOrders(Orders o);
	
	public Orders findByIdOrders(String oid);
	
	public List<Orders> findUserOrders(String uid);
	
	public void updateUserOrders(@Param("ostatus")String ostatus,@Param("oid")String oid);
	
	
}
