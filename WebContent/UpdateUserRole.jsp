<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		width: 280px;
		height: 25px;
		font-size: 17px;
	}
	.bt{
		width: 70px;
		height: 35px;
		font-size: 20px;
	}
</style>
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
$(function(){
	$(function(){
		$.ajax({
			type : "post",
			url : "${pageContext.request.contextPath }/ManagerController/findAllRoleName.action",//修改用户角色时的查询所有
			cache : false,
			dataType : "json",
			success : function(data) {
				for ( var i = 0; i < data.length; i++) {
					$("#roleSelect").append("<option id="+data[i].r_id+" value="+data[i].r_name+">"+data[i].r_name+"</option>")
				}
			}
		})
	})
	
	//选择角色
	$("select").click(function(){
		var selectTxt = $("select option:checked").text(); 
		var selectID = $("select option:checked").attr("id"); 
		$("#r_name").val(selectTxt);
		$("#r_id").val(selectID);
	})
})

</script>
</head>
<body bgColor="#f4ddff">
<br>
<div id="d">
<center><h2>修改用户角色</h2></center>
<form action="${pageContext.request.contextPath }/ManagerController/updateUserRole.action" method="post" >
	用户&nbsp;&nbsp;ID：
	      <input type="text" class="it" id="uid" name="uid" value="${byIdUser.uid }" readonly="readonly"><br>
	用户姓名：<input type="text" class="it" id="uname" name="uname" value="${byIdUser.uname }" readonly="readonly"><br>
	角色名称：<input type="text" class="it" id="r_name" name="r_name" value="${byIdUser.role.r_name }" readonly="readonly"><br>
	请选择角色：<select id="roleSelect"></select>
	<br>
	<br>
	<center>
	<input type="submit" class="bt" value="提交">
	</center>
    <input type="hidden" class="it" id="r_id" name="r_id" value="${byIdUser.role.r_id }" readonly="readonly"><br>

</form>
</div>
</body>
</html>
