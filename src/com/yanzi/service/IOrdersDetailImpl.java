package com.yanzi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanzi.bean.OdCustom;
import com.yanzi.bean.OrdersDetail;
import com.yanzi.dao.OrdersDetailMapper;

@Service
public class IOrdersDetailImpl implements IOrdersDetail {
	
	@Autowired
	OrdersDetailMapper ordersDetailMapper;

	@Override
	public void addOrdersDetail(OrdersDetail od) throws Exception {
		ordersDetailMapper.addOrdersDetail(od);;
	}

	@Override
	public List<OdCustom> findAllOrdersDetail(){
		List<OdCustom> list = ordersDetailMapper.findAllOrdersDetail();
		return list;
	}
	
	@Override
	public int updateOrdersDetail(@Param("odstatus")String odstatus,@Param("oid")String oid){
		int i = ordersDetailMapper.updateOrdersDetail(odstatus, oid);
		return i;
	}
	
	@Override
	public List<OrdersDetail> findUpdOrdersDetail(String oid){
		List<OrdersDetail> list = ordersDetailMapper.findUpdOrdersDetail(oid);
		return list;
	}


}
