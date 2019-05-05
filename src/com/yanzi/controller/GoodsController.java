package com.yanzi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yanzi.bean.Goods;
import com.yanzi.service.IGoods;
import com.yanzi.util.Page;

@Controller
@RequestMapping("GoodsController")
public class GoodsController {
	
	@Autowired
	IGoods iGoods;
	
	@RequestMapping("/findGoodsPage")
	public String findGoodsPage(HttpSession session,
			@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage){
		Page<Goods> pageGoods = iGoods.methodPage(currentPage);
		session.setAttribute("pageGoods", pageGoods);
		return "redirect:/ListGoods.jsp";
	}

}
