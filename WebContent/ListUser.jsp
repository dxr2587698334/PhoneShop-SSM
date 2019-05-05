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
		//全选反选
		$("#uid").click(function(){
			var uids = $(".uids");
			if($(this).prop("checked")){
				uids.attr("checked",'checked');
			}else{
				uids.attr("checked",false);
			}
		})
		
		//获取选中的
		$("#bt").click(function(){
			var arr = [];
			$(".uids:checked").each(function(index,item){
				arr.push($(item).val());
			})
			//alert("arr--->"+arr);
			var uids = arr.toString();
			var f = confirm("你确定要删除"+arr.length+"个用户吗？");
			if(f){
				window.location.href="DelsBatchUser?uids="+uids;
			}
		})
	})
</script>
</head>
<body bgColor="#f4ddff">
<br>
<center>用户列表</center>
<table width="1050" border="1" cellSpacing="0" align="center">
		<tr>
			<tr>
				<td colspan="7" align="left">
				<button id="bt">批量删除</button>&nbsp;&nbsp;
				</td>
			</tr>
			<tr>
			<td>
				<input type="checkbox" id="uid">
			</td>
			<td>用户ID</td>
			<td>用户姓名</td>
			<td>角色ID</td>
			<td>角色名称</td>
			<td>操作</td>
		</tr>
	<c:forEach items="${listUser}" var="u">
		<tr>
			<td>
				<input type="checkbox" id="uids" class="uids" value="${u.uid }">
			</td>
			<td>${u.uid }</td>
			<td>${u.uname }</td>
			<td>${u.role.r_id}</td>
			<td>${u.role.r_name}</td>
			<td>
				<a href="${pageContext.request.contextPath }/ManagerController/findByIdUserRole.action?uid=${u.uid }">修改角色</a>
			</td>
		</tr>
	</c:forEach>

</table>		
</body>
</html>
