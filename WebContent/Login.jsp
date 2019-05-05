<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#d1{
		position: absolute;
		border:1px;
		width:450px;
		height:320px;
		left: 400px;
		top: 100px;
		background: #d0bafe;
		/* font-size: 18px; */
	}
	#d2{
		position: absolute;
		border:1px;
		width:400px;
		height:280px;
		left: 20px;
		top: 10px;
		/* background: gray; */
		/* text-align:left; */
	}
	.ipt{
		position: absolute;
		width: 200px;
		height: 32px;
		font-size: 15px;
	}
	#v{
		position: absolute;
		top: 155px;
		left: 290px;
	}
	.bt{
		width: 70px;
		height: 35px;
		font-size: 20px;
	}
</style>
<script type="text/javascript">
	function _change() {
		/*
		1. 得到img元素
		2. 修改其src为/day11_3/VerifyCodeServlet
		*/
		var imgEle = document.getElementById("img");
		imgEle.src = "${pageContext.request.contextPath}/UserController/getVerifyCode.action?a=" + new Date().getTime();
	}
</script>
</head>
<body bgColor="#f4ddff">

<br><br>
<br><br>

<div id="d1">
	<div id="d2">
	<h2><font color="#ff0000">欢迎登录</font></h2>
		<form action="<%= request.getContextPath() %>/UserController/login.action" method="post">
			账&nbsp;&nbsp;&nbsp;户：<input type="text" class="ipt" name="uid" value="111" size="35"><br><br>
			密&nbsp;&nbsp;&nbsp;码：<input type="text" class="ipt" name="upwd" value="aaa" size="35"><br><br>
			验证码：<input type="text" class="ipt" name="nimgs">
			        <div id="v">
			        <a href="javascript:_change()">
			    	     <img id="img" src="${pageContext.request.contextPath}/
			    	     UserController/getVerifyCode.action"/>
			        </a>
		        	</div>
			        <br/><br/><br/>
			        &nbsp;&nbsp;&nbsp;
			        &nbsp;&nbsp;&nbsp;
			        &nbsp;&nbsp;&nbsp;
					<input type="submit" class="bt" value="登录">&nbsp;
					没有账号点击<a href="AddUser.jsp">【注册】</a>
		</form>
	</div>
</div>
  
</body>
</html>
