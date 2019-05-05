<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/index.js"></script>

<title>Insert title here</title>
</head>
<body onload="ond()" bgColor="#f4ddff">
<br>
<center>商品管理列表</center>
<table border="1" width="600" cellspacing="0" align="center">
	<tr>
		<th colspan="4" align="left">
		<a href="AddGoods.jsp">添加商品</a>&nbsp;&nbsp;
		</th>
	</tr>
	<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
		<td>商品ID</td>
		<td>名称</td>
		<td>价格</td>
		<td>状态</td>
	</tr>
	<c:forEach items="${pageGoodsManager.listT }" var="g" varStatus="count">
		<tr align="center" onmouseover="omo(this)" onmouseout="omt(this)">
			<td>${g.gid }</td>
			<td>
			<a href="${pageContext.request.contextPath }/ManagerController/findByIdGoods.action?gid=${g.gid }">${g.gname }</a>
			</td>
			<td>${g.gmoney }</td>
			<td>${g.gstatus }</td>
		</tr>
	</c:forEach>
</table>
<center>
<jsp:include page="page/GoodsPageManager.jsp"></jsp:include>
</center>

 </body>
</html>
