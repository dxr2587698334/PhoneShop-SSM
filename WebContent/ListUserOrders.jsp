<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
<script type="text/javascript" src="js/index.js"></script>

</head>
<body onload="ond()" bgColor="#f4ddff">
<br>
<center>订单列表</center>
<table width="700" border="1" cellSpacing="0" align="center">
		<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
			<th>订单编号</th>
			<th>下单时间</th>
			<th>收货地址</th>
			<th>派发状态</th>
		</tr>
	<c:forEach items="${listUserOrders}" var="listOrders">
		<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
			<td>${listOrders.oid}</td>
			<td>${listOrders.oTime}</td>
			<td>${listOrders.oaddress}</td>
			<td>${listOrders.oStatus}</td>
		</tr>
	</c:forEach>
</table>		
</body>
</html>
