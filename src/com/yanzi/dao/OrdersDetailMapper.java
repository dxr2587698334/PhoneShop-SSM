package com.yanzi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanzi.bean.OdCustom;
import com.yanzi.bean.OrdersDetail;

public interface OrdersDetailMapper {
	
	public void addOrdersDetail(OrdersDetail od)throws Exception;
	
	public List<OdCustom> findAllOrdersDetail();
	
	public int updateOrdersDetail(@Param("odstatus")String odstatus,@Param("oid")String oid);

	public List<OrdersDetail> findUpdOrdersDetail(String oid);
	
}
