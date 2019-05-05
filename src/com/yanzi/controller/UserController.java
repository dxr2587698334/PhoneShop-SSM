package com.yanzi.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanzi.bean.Privilege;
import com.yanzi.bean.User;
import com.yanzi.service.IPrivilege;
import com.yanzi.service.IUser;
import com.yanzi.util.VerifyCode;

//标识这歌类是Controller
@Controller
// 请求该UserController的路径
@RequestMapping("UserController")
public class UserController {

	@Autowired
	IUser iUser;

	@Autowired
	IPrivilege iPrivilege;
	
	//生成验证码
	@RequestMapping("/getVerifyCode")
	public void getVerifyCode(HttpServletRequest request,HttpServletResponse response) throws IOException{
		/*
		 * 1. 生成图片
		 * 2. 保存图片上的文本到session域中
		 * 3. 把图片响应给客户端
		 */
		VerifyCode vc = new VerifyCode();
		BufferedImage image = vc.getImage();
		//保存图片上的文本到session域
		request.getSession().setAttribute("session_vcode", vc.getText());
		VerifyCode.output(image, response.getOutputStream());
	}

	// 登录
	@RequestMapping("/login")
	public String login(HttpSession session, String uid, String upwd,String nimgs) {
		//获取验证码
		String sessionVcode = (String) session.getAttribute("session_vcode");
		User user = iUser.login(uid, upwd);
		List<Privilege> privilegeUserList = iPrivilege.findUserPrivilege(uid);
		if(nimgs.equals(sessionVcode)){
			if (user != null) {
				session.setAttribute("user", user);
				session.setAttribute("privilegeUserList", privilegeUserList);
				return "redirect:/main.jsp";
			} else {
				return "redirect:/Login.jsp";
			}
		}else{
			return "redirect:/Login.jsp";
		}
	}

	// 注册
	@RequestMapping("/addUser")
	public String adUser(User user) {
		iUser.addUser(user);
		return "redirect:/Login.jsp";
	}

	@RequestMapping("/Exit")
	public String Exit(HttpSession session) {
		session.invalidate();
		return "redirect:/Login.jsp";
	}

	// 修改个人信息
	@RequestMapping("/updateUserInfo")
	public String updateUserInfo(HttpSession session, User user) {
		iUser.updateUserInfo(user);
		User user2 = iUser.findByIdUser2(user.getUid());
		session.removeAttribute("user");
		session.setAttribute("user", user2);
		return "redirect:/InfoUser.jsp";
	}

}
