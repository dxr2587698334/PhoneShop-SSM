package com.yanzi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.openlab.bean.OdCustom;
import com.openlab.bean.OrdersDetail;

public interface IOrdersDetail {
	
	public void addOrdersDetail(OrdersDetail od)throws Exception;
	
	public List<OdCustom> findAllOrdersDetail();
	
	public int updateOrdersDetail(@Param("odstatus")String odstatus,@Param("oid")String oid);

	public List<OrdersDetail> findUpdOrdersDetail(String oid);

}
