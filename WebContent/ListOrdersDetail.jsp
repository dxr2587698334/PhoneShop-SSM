<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript">
	$(function(){
		$(".bt",this).click(function(){
			var oid = $(this).parents("tr").find(".oid").text(); 
			var stu = $(this).parents("tr").find(".stu").text(); 
			//alert(stu)
			if(stu=="等待处理"){
				//location.href="UpdOrdersDetail?odid="+odid+"&oid="+oid;
				//$(".bt",this).text("已发");
				location.href="ManagerController/updateOrdersDetail.action?oid="+oid;
			}else if(stu=="已发"){
				alert("不用再点了，货已经发了");
			}
		})
	})
</script>
</head>
<body onload="ond()" bgColor="#f4ddff">
<br>
<center>订单明细列表</center>
<table width="700" border="1" cellSpacing="0" align="center">
		<tr align="center">
			<th>订单编号</th>
			<th>订单总额</th>
			<th>收货地址</th>
			<th>派发状态</th>
			<th>发送</th>
		</tr>
	<c:forEach items="${listOrdersDetail}" var="od">
		<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
			<td class="oid">${od.oid}</td>
			<td>${od.totalmoney}</td>
			<td>${od.odaddress}</td>
			<td class="stu">${od.odstatus}</td>
			<td >
				<button class="bt">发送</button>
			</td>
		</tr>
	</c:forEach>
</table>		
</body>
</html>
