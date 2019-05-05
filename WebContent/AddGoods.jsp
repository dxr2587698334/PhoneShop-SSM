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
		height:300px;
		margin-left: 300px;
		/*text-align:center;*/
		font-size: 18px;
		border: 1px solid red;
		padding: 2%;
	}
	.it{
		width: 280px;
		height: 35px;
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
<center><h2>添加商品</h2></center>
<form action="${pageContext.request.contextPath }/ManagerController/uploadGoods.action" 
	method="post" enctype="multipart/form-data">
	商品图片：<input type="file" class="it" name="images" size="35"><br>
	商品名称：<input type="text" class="it" name="gname" size="35"><br>
	商品价格：<input type="text" class="it" name="gmoney" size="35"><br>
	<input type="submit" class="bt" value="提交">
</form>
</div>
</body>
</html>
