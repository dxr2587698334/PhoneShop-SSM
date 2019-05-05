<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/tableColor.css"/>
<script type="text/javascript" src="js/tableColor.js"></script>
<script type="text/javascript">
	$(function(){
		$("#bt").click(function(){
			window.location.href="dtree/AddRole.jsp";
		})
	})
</script>
</head>
<body bgColor="#f4ddff">
<br>
<center>角色列表</center>
<table width="1050" border="1" cellSpacing="0" align="center">
		<tr>
			<tr>
				<td colspan="7" align="left">
				<!-- 
				<a href="dtree/AddRole.jsp" >
					<input type="button" value="新增角色"> 
				</a>
				 -->
				 <button id="bt">新增角色</button>
				</td>
			</tr>
			<tr>
			<td>角色ID</td>
			<td>角色名称</td>
			<td>角色描述</td>
			<td>操作</td>
		</tr>
	<c:forEach items="${listRole}" var="r">
		<tr>
			<td>${r.r_id }</td>
			<td>${r.r_name }</td>
			<td>${r.r_describe}</td>
			<td>
				<a href="${pageContext.request.contextPath }/
				ManagerController/findByIdRolePrivilege.action?r_id=${r.r_id }">修改角色</a>&nbsp;/&nbsp;
				<a href="${pageContext.request.contextPath }/
				ManagerController/deleteRole.action?r_id=${r.r_id }">删除</a>
			
			</td>
		</tr>
	</c:forEach>

</table>		
</body>
</html>
