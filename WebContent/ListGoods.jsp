<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="#f4ddff">
<br>

<table border="1" width="600" cellspacing="0" align="center">
	<c:forEach items="${pageGoods.listT }" var="g" varStatus="count">
		<c:if test="${count.index%4==0 }">
			<tr align="center">
		</c:if>
			<td>
				<table width="180" height="200" cellspacing="0">
					<tr align="center">
						<td>
							<img src="GoodsImage/${g.gimage }" width="180" height="200">
							${g.gname },${g.gmoney }<br>
							<a href="${pageContext.request.contextPath }/
							CarController/addUserCar.action?gid=${g.gid}">加入购物车</a>
						</td>
					</tr>
				</table>
			</td>
		<c:if test="${count.index%4==3 }">
			</tr>
		</c:if>
	</c:forEach>
</table>
<center>
<jsp:include page="page/GoodsPage.jsp"></jsp:include>
</center>

<%-- 
<a href="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action?currentPage=1">首页</a>
<c:choose>
	<c:when test="${pageGoods.currentPage==1 }">
		<a href="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action?currentPage=1">上页</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action?currentPage=${pageGoods.currentPage-1}">上页</a>
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${pageGoods.currentPage<pageGoods.totalPage }">
		<a href="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action?currentPage=${pageGoods.currentPage+1}">下页</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action?currentPage=${pageGoods.totalPage}">下页</a>
	</c:otherwise>
</c:choose>
<a href="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action?currentPage=${pageGoods.totalPage}">末页</a>
 --%>

<%-- 
当前页---》${pageGoods.currentPage }<br>
每页的大小---》${pageGoods.pageSize }<br>
总页数---》${pageGoods.totalPage }<br>
总记录数---》${pageGoods.totalCount }<br>
--%>
 </body>
</html>
