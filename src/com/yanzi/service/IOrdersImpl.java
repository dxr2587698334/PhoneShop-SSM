package com.yanzib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.Orders;
import com.yanzi.dao.OrdersMapper;

@Service
public class IOrdersImpl implements IOrders {
	
	@Autowired
	OrdersMapper ordersMapper;

	@Override
	public void addOrders(Orders o) {
		ordersMapper.addOrders(o);
	}
	
	@Override
	public Orders findByIdOrders(String oid){
		Orders orders = ordersMapper.findByIdOrders(oid);
		return orders;
	}
	
	@Override
	public List<Orders> findUserOrders(String uid){
		List<Orders> list = ordersMapper.findUserOrders(uid);
		return list;
	}
	
	public void updateUserOrders(String ostatus,String oid){
		System.out.println("1111111111"+ostatus+"------>"+oid);
		ordersMapper.updateUserOrders(ostatus, oid);
	}
	

}
