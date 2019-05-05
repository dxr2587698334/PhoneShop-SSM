<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#d{
		position: absolute;
		border:1px;
		background:#d0bafe;
		width:400px;
		height:250px;
		margin-left: 300px;
		/*text-align:center;*/
		font-size: 18px;
		border: 1px solid red;
		padding: 2%;
	}
	.it{
		width: 400px;
		height: 35px;
		font-size: 15px;
	}
	.bt{
		width: 100px;
		height: 35px;
		font-size: 20px;
	}
</style>
</head>
<body bgColor="#f4ddff">
<br>
<div id="d">
<center><h2>提交订单</h2></center>
<form action="<%= request.getContextPath() %>/OrdersController/addOrders.action" method="post">
	收货地址：<input type="text" class="it" name="oaddress" size="50"><br>
	<c:forEach items="${readyOrdersList }" var="listReadyOrder">
		商品id<input type="checkbox" name="cids" value="${listReadyOrder.cid}" checked="checked">${listReadyOrder.cname }<br>
	</c:forEach>
	<input type="submit" class="bt" value="提交订单">
</form>
</div>
</body>
</html>
