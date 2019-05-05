<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<title>Insert title here</title>
</head>
<body bgColor="#f4ddff">

<center>
<table border="1" width="380" height="340" cellspacing="0" bordercolor="blue">
	<tr>
		<td>
		<form action="<%= request.getContextPath() %>/ManagerController/updateGoodsStatus.action" method="post">
			I&nbsp;&nbsp;&nbsp;D：<input type="text" name="gid" value="${goodsManager.gid}" readonly="readonly" size="35"><br><br>
			名称：<input type="text" name="gname" value="${goodsManager.gname}" readonly="readonly" size="35"><br><br>
			单价：<input type="text" name="gmoney" value="${goodsManager.gmoney}" size="35"><br><br>
			状态：<select name="gstatus">
					<option>${goodsManager.gstatus}</option>
					<option>促销中</option>
					<option>下架</option>
		  		</select>
		  		<br>
		  		<br>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;
					<input type="submit" value="提交">
		</form>
		</td>
	</tr>
</table>
</center>
  
</body>
</html>
