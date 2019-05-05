package com.yanzi.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.openlab.bean.Car;
import com.openlab.bean.Goods;
import com.openlab.bean.OdCustom;
import com.openlab.bean.Pr;
import com.openlab.bean.Privilege;
import com.openlab.bean.Role;
import com.openlab.bean.User;
import com.openlab.service.ICar;
import com.openlab.service.IGoods;
import com.openlab.service.IOrders;
import com.openlab.service.IOrdersDetail;
import com.openlab.service.IPr;
import com.openlab.service.IPrivilege;
import com.openlab.service.IRole;
import com.openlab.service.IUser;
import com.openlab.util.Page;

@Controller
@RequestMapping("/ManagerController")
public class ManagerController {

	@Autowired
	IOrdersDetail iOrdersDetail;

	@Autowired
	IOrders iOrders;

	@Autowired
	IGoods iGoods;
	
	@Autowired
	ICar iCar;
	
	@Autowired
	IUser iUser;

	@Autowired
	IRole iRole;
	
	@Autowired
	IPrivilege iPrivilege;
	
	@Autowired
	IPr iPr;
	
	// 查询订单明细
	@RequestMapping("/findAllOrdersDetail")
	public String findAllOrdersDetail(HttpSession session) {
		List<OdCustom> listOrdersDetail = iOrdersDetail.findAllOrdersDetail();
		session.setAttribute("listOrdersDetail", listOrdersDetail);
		return "redirect:/ListOrdersDetail.jsp";
	}

	// 修改订单
	@RequestMapping("/updateOrdersDetail")
	public String updateOrdersDetail(String oid) {
		String s = "已发";
		int i = iOrdersDetail.updateOrdersDetail(s, oid);
		if(i!=0){
			iOrders.updateUserOrders(s, oid);
		}
		return "findAllOrdersDetail.action";
	}

	// 查询所有商品（管理）
	@RequestMapping("/findAllGoods")
	public String findAllGoods(HttpSession session,
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage) {
		Page<Goods> pageGoodsManager = iGoods.methodPage(currentPage);
		session.setAttribute("pageGoodsManager", pageGoodsManager);
		return "redirect:/ListGoodsManager.jsp";
	}

	// 查询单个商品
	@RequestMapping("/findByIdGoods")
	public String findByIdGoods(HttpSession session,int gid) {
		Goods goodsManager = iGoods.findByIdGoods(gid);
		session.setAttribute("goodsManager", goodsManager);
		return "redirect:/UpdateGoodsManager.jsp";
	}
	
	//修改单个商品
	@RequestMapping("/updateGoodsStatus")
	public String updateGoodsStatus(Goods goods){
		int i = iGoods.updateGoods(goods);
		if(i!=0){
			Car c = new Car();
			c.setCmoney(goods.getGmoney());
			c.setCstatus(goods.getGstatus());
			c.setGid(goods.getGid());
			iCar.updateCar(c);
		}
		return "findAllGoods.action";
	}
	
	//添加商品，上传图片
	@RequestMapping(value="/uploadGoods",method=RequestMethod.POST)
	public String uploadGoods(HttpServletRequest request,@ModelAttribute Goods goods,
			MultipartFile images) throws IllegalStateException, IOException{
		String filename = images.getOriginalFilename();
//		filename======>锤子-R1-2659.jpg
		System.out.println("filename======>"+filename);
//		goods---------Goods [gid=0, gmoney=2659, gname=锤子-R1, gimage=null, gstatus=null]
		System.out.println("goods---------"+goods);
		Goods g = new Goods();
		g.setGname(goods.getGname());
		g.setGmoney(goods.getGmoney());
		g.setGimage(filename);
		//存入数据库
		iGoods.addGoods(g);
		File file = new File(
				"D:\\2018--Eclipse\\新--Eclipse--Servlet--10--项目"
				+ "\\TestPhoneShopSSM\\WebContent\\GoodsImage\\"+ filename);
		images.transferTo(file);
		return "findAllGoods.action";
	}
	
	//用户管理
	@RequestMapping("/findAllUser")
	public String findAllUser(HttpSession session){
		List<User> listUser = iUser.findAllUser();
		System.out.println("listUser--------------->"+listUser.size());
		session.setAttribute("listUser", listUser);
		return "redirect:/ListUser.jsp";
	}
	
	//修改角色(查询单个用户)
	@RequestMapping("/findByIdUserRole")
	public String findByIdUserRole(HttpSession session,String uid){
		User byIdUser = iUser.findByIdUser(uid);
		session.setAttribute("byIdUser",byIdUser);
		return "redirect:/UpdateUserRole.jsp";
	}

	//修改用户角色时的查询所有
	@RequestMapping("/findAllRoleName")
	@ResponseBody
	public List<Role> findAllRoleName(){
		List<Role> listRole = iRole.findAllRole();
		System.out.println("listRole-------->"+listRole);
		return listRole;
	}
	
	//修改用户角色
	@RequestMapping("/updateUserRole")
	public String updateUserRole(int r_id,String uid){
		iUser.updateUserRole(r_id, uid);
		return "findAllUser.action";
	}
	
	//查询所有角色
	@RequestMapping("/findAllRole")
	public String findAllRole(HttpSession session){
		List<Role> listRole = iRole.findAllRole();
		session.setAttribute("listRole", listRole);
		return "redirect:/ListRole.jsp";
	}
	
	//添加角色
	@RequestMapping("/addRole")
	public String addRole(Role role,String p_id){
		iRole.addRole(role);
		int r_id = iRole.getLastID();
		String subs = p_id.substring(2);
		String[] sid = subs.split(",");
		if(r_id!=0){
			for (String p_ids : sid) {
				Pr p = new Pr(r_id,p_ids);
				iPr.addPr(p);
			}
		}
		return "findAllRole.action";
	}
	
	//查询所有权限
	@RequestMapping("/findAllPrivilege")
	@ResponseBody
	public List<Privilege> findAllPrivilege(HttpSession session){
		List<Privilege> findAllPrivilege = iPrivilege.findAllPrivilege();
		session.setAttribute("findAllPrivilege", findAllPrivilege);
		return findAllPrivilege;
	}
	
	//修改角色权限前的查询
	@RequestMapping("/findByIdRolePrivilege")
	public String findByIdRolePrivilege(HttpSession session,int r_id){
		Role idRole = iRole.findByIdRole(r_id);
		session.setAttribute("idRole", idRole);
		return "redirect:/dtree/UpdateRole.jsp";
	}
	
	//修改角色的权限
	@RequestMapping("/updateRole")
	public String updateRole(Role role,String p_id){
		int i = iRole.updateRole(role);
		String subs = p_id.substring(2);
		String[] sid = subs.split(",");
		if(i!=0){
			iPr.delPr(role.getR_id());
			for (String p_ids : sid) {
				Pr p = new Pr(role.getR_id(),p_ids);
				iPr.addPr(p);
			}
		}
		return "findAllRole.action";
	}
	
	//删除角色
	@RequestMapping("/deleteRole")
	public String deleteRole(int r_id){
		int i = iPr.delBatchPr(r_id);
		int i2 = iUser.updateUserRole2(r_id);
			iRole.delRole(r_id);
		return "findAllRole.action";
	}
}
