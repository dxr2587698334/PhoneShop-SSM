<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript">
	
	//全选/反选     
	function checkAll(){
		var inputId = document.getElementById("inputId");
		//alert("inputId="+inputId.checked);
		var ids = document.getElementsByName("ids");
		for(var i = 0;i<ids.length;i++){
			if(inputId.checked==true){
				ids[i].checked=true;
			}else{
				ids[i].checked=false;
			}
		}
	}
	
	//批量删除
	function delAll(){
		var arr = [];
		var ids = document.getElementsByName("ids");
		for(var i = 0;i<ids.length;i++){
			if(ids[i].checked==true){
				arr.push(ids[i].value);
			}
		}
		var cids = arr.toString();
		//alert(cids);
		var f = confirm("你确定要删除"+cids+"这些商品吗？");
		if(f){
		window.location.href="CarController/delAllUserCar.action?cids="+cids;
		//window.location.href="沁园春·雪.html";
		}
	}
	
	//生成订单
	function readyOrder(){
		var arr = [];
		var ids = document.getElementsByName("ids");
		for(var i = 0;i<ids.length;i++){
			if(ids[i].checked==true){
				arr.push(ids[i].value);
			}
		}
		var cids = arr.toString();
		window.location.href="OrdersController/readyOrders.action?cids="+cids;
	}
	
</script>
</head>
<body onload="ond()" bgColor="#f4ddff">
<br>
<table width="700" border="1" cellspacing="0" align="center" bordercolor="pink">
	<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
		<td colspan="7">
			<input type="button" onclick="delAll()" value="批量删除 ">&nbsp;
			<input type="button" onclick="readyOrder()" value="提交订单 ">
			
		</td>
	</tr>
	<tr onmouseover="omo(this)" onmouseout="omt(this)">
		<td>
			<input type="checkbox" id="inputId" onclick="checkAll()">
		</td>
		<td>名称</td>
		<td>单价</td>
		<td>详图</td>
		<td>数量</td>
		<td>总额</td>
		<td>状态</td>
	</tr>
	<c:forEach items="${listUserCar }" var="c">
		<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
			<td>
				<input type="checkbox" name="ids" value="${c.cid }">
			</td>
			<td width="140">${c.cname }</td>
			<td>${c.cmoney }</td>
			<td width="130">
				<img src="GoodsImage/${c.cimage }" width="130" height="100">
			</td>
			<td>${c.cnum }</td>
			<td>${c.cmoney*c.cnum }</td>
			<td>${c.cstatus }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>
