package com.yanzi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanzi.bean.Car;
import com.yanzi.bean.Orders;
import com.yanzi.bean.OrdersDetail;
import com.yanzi.bean.User;
import com.yanzi.service.ICar;
import com.yanzi.service.IOrders;
import com.yanzi.service.IOrdersDetail;
import com.yanzi.util.CurrentTime;
import com.yanzi.util.IDutil;

@Controller
@RequestMapping("/OrdersController")
public class OrdersController {

	@Autowired
	ICar iCar;

	@Autowired
	IOrders iOrders;

	@Autowired
	IOrdersDetail iOrdersDetail;

	// 生成订单前的查询
	@RequestMapping("/readyOrders")
	public String readyOrders(HttpSession session, String cids) {
		String[] cidss = cids.split(",");
		List<Car> readyOrdersList = iCar.findReadyOrders(cidss);
		session.setAttribute("readyOrdersList", readyOrdersList);
		return "redirect:/ReadyOrder.jsp";
	}

	// 插入订单数据
	@RequestMapping("/addOrders")
	public String addOrders(HttpSession session, String oaddress, String cids) throws Exception {
		List<Car> addOrdersList = (List<Car>) session.getAttribute("readyOrdersList");
		int totalMoney = 0;
		for (Car c : addOrdersList) {
			int cmoney = c.getCmoney();
			int cnum = c.getCnum();
			totalMoney += (cmoney * cnum);
		}
		Orders o = new Orders();
		o.setOid(IDutil.getOrderID());
		o.setOtotalMoney(totalMoney);
		o.setOaddress(oaddress);
		o.setoTime(CurrentTime.getCurrentTime());
		User u = (User) session.getAttribute("user");
		o.setUid(u.getUid());
		// 插入订单数据
		iOrders.addOrders(o);
		Orders os = iOrders.findByIdOrders(o.getOid());
		if (os != null) {
			for (Car c : addOrdersList) {
				OrdersDetail od = new OrdersDetail();
				od.setOdmoney(c.getCmoney());
				od.setOdtotalmoney(c.getCmoney() * c.getCnum());
				od.setOdnum(c.getCnum());
				od.setOdaddress(os.getOaddress());
				od.setOid(os.getOid());
				od.setGid(c.getGid());
				// 插入订单明细数据
				iOrdersDetail.addOrdersDetail(od);
				// 逐个删除购物车中选中 的商品
				iCar.delUserCar(c.getCid());
			}
		}
		return "findUserOrders.action";
	}
	
	// 查询自己的订单
	@RequestMapping("/findUserOrders")
	public String findUserOrders(HttpSession session){
		User u = (User) session.getAttribute("user");
		List<Orders> listUserOrders = iOrders.findUserOrders(u.getUid());
		session.setAttribute("listUserOrders", listUserOrders);
		return "redirect:/ListUserOrders.jsp";
	}	

}
