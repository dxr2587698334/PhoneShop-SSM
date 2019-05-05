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
		width:450px;
		height:350px;
		margin-left: 400px;
		text-align:center;
		font-size: 18px;
		border: 1px solid red;
	}
	.it{
		width: 300px;
		height: 30px;
		font-size: 15px;
	}
	.bt{
		width: 70px;
		height: 35px;
		font-size: 20px;
	}
</style>
</head>
<body bgColor="#f4ddff">

<br>

<div id="d">
	<h2><font color="#ff0000">欢迎注册</font></h2>
	<form action="${pageContext.request.contextPath }/UserController/updateUserInfo.action" method="post">
		账户：<input type="text" class="it" name="uid" value=${user.uid} size="35" readonly="readonly"><br>
		姓名：<input type="text" class="it" name="uname" value=${user.uname} size="35" readonly="readonly"><br>
		密码：<input type="text" class="it" name="upwd" value=${user.upwd} size="35"><br>
		电话：<input type="text" class="it" name="uphone" value=${user.uphone} size="35"><br>
		地址：<input type="text" class="it" name="uaddress" value=${user.uaddress} size="35"><br>
			<br>
			<input type="submit" class="bt" value="提交">
	</form>
</div>
</body>
</html>
