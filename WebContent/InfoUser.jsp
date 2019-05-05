<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/tableColor.css" />
<script type="text/javascript" src="js/tableColor.js"></script>
<title>个人信息</title>


</head>
<body bgColor="#f4ddff">
<br>
<center>
个人信息
</center>
<table width="400" border="1" cellSpacing="0" align="center">
		<tr align="center">
			<th>姓名</th>
			<td>${user.uname }</td>
		</tr>
		<tr align="center">
			<th>密码</th>
			<td>
			<a href="UpdateUserInfo.jsp">${user.upwd }</a>
			&nbsp;&nbsp;&nbsp;【点击修改密码】
			</td>
		</tr>
		<tr align="center">
			<th>电话</th>
			<td>${user.uphone }</td>
		</tr>
		<tr align="center">
			<th>地址</th>
			<td>${user.uaddress}</td>
		</tr>
		<tr align="center">
			<th>角色ID</th>
			<td>${user.role_rid}</td>
		</tr>
</table>		
</body>
</html>
