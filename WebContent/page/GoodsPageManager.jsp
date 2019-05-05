<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="${pageContext.request.contextPath }/ManagerController/findAllGoods.action?currentPage=1">首页</a>
<c:choose>
	<c:when test="${pageGoods.currentPage==1 }">
		<a href="${pageContext.request.contextPath }/ManagerController/findAllGoods.action?currentPage=1">上页</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath }/ManagerController/findAllGoods.action?currentPage=${pageGoods.currentPage-1}">上页</a>
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${pageGoods.currentPage<pageGoods.totalPage }">
		<a href="${pageContext.request.contextPath }/ManagerController/findAllGoods.action?currentPage=${pageGoods.currentPage+1}">下页</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath }/ManagerController/findAllGoods.action?currentPage=${pageGoods.totalPage}">下页</a>
	</c:otherwise>
</c:choose>
<a href="${pageContext.request.contextPath }/ManagerController/findAllGoods.action?currentPage=${pageGoods.totalPage}">末页</a>
