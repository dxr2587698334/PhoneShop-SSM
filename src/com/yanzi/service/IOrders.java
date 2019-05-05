package com.yanzi.service;

import java.util.List;

import com.yanzi.bean.Orders;

public interface IOrders {
	
	public void addOrders(Orders o);
	
	public Orders findByIdOrders(String oid);
	
	public List<Orders> findUserOrders(String uid);
	
	public void updateUserOrders(String ostatus,String oid);
	

}
