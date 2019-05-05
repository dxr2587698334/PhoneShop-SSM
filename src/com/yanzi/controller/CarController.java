package com.yanzi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanzi.bean.Car;
import com.yanzi.bean.Goods;
import com.yanzi.bean.User;
import com.yanzi.service.ICar;
import com.yanzi.service.IGoods;

@Controller
@RequestMapping("/CarController")
public class CarController {
	
	@Autowired
	ICar iCar;
	
	@Autowired
	IGoods iGoods;
	
	@RequestMapping("/addUserCar")
	public String addUserCar(HttpSession session,int gid){
		User u = (User) session.getAttribute("user");
		Car findCar = iCar.findByIdUserCar(gid, u.getUid());
		Goods g = iGoods.findByIdGoods(gid);
		Car newCar = new Car();
		newCar.setCmoney(g.getGmoney());
		newCar.setCname(g.getGname());
		newCar.setCimage(g.getGimage());
		newCar.setGid(g.getGid());
		newCar.setUid(u.getUid());
		if(findCar!=null){
			iCar.updateUserCar(findCar.getCid(), findCar.getCnum()+1);
		}else{
			iCar.addUserCar(newCar);
		}
		return "findAllUserCar.action";
	}
	
	@RequestMapping("/findAllUserCar")
	public String findAllUserCar(HttpSession session){
		User u = (User) session.getAttribute("user");
		List<Car> listUserCar = iCar.findAllUserCar(u.getUid());
		//存入Model
		session.setAttribute("listUserCar", listUserCar);
		return "redirect:/ListUserCar.jsp";
	}
	
	//批量删除
	@RequestMapping("/delAllUserCar")
	public String delAllUserCar(String cids){
		String[] cidss = cids.split(",");
		iCar.delAllUserCar(cidss);
		return "findAllUserCar.action";
	}

}
