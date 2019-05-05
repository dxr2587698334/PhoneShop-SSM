package com.yanzi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanzi.bean.OrdersDetail;
import com.yanzi.service.IOrdersDetail;

@Controller
@RequestMapping("/OrdersDetailController")
public class OrdersDetailController {
	
//	@Autowired
//	IOrdersDetail iOrdersDetail;
//	
//	@RequestMapping("/managerOrdersDetail")
//	public String managerOrdersDetail(HttpSession session){
//		List<OrdersDetail> listOrdersDetail = iOrdersDetail.findAllOrdersDetail();
//		session.setAttribute("listOrdersDetail", listOrdersDetail);
//		return "redirect:/ListOrdersDetail.jsp";
//	}
	

}
