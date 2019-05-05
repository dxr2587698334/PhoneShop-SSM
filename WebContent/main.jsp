<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="jq/jquery-easyui-1.2.6/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="jq/jquery-easyui-1.2.6/themes/icon.css">
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jq/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">
	body{
		margin:0px;
	}
	ul { 
		padding-left:1px;
		} 
	a{
		text-decoration:none;/* 去掉下划线 */
		font-size:16px;
		color:red;
	}
	li{
		list-style-type:none;
		font-size:16px;
		font-family:"SimSun";/* 宋体 */
		/*font-weight:bold; 加粗 */
	}
</style>
<script type="text/javascript">
	$(function(){
		//默认加载---》沁园春·雪.html
		$('a').each(function(index,element){
			if($(element).text()=='手机商城'){
				var title = $(element).text();//手机商城
				var src = $(element).attr('title');//手机商城
				$('#tt').tabs(
					'add',
					{
						title:title,
						content:'<iframe frameborder="0" style="width:100%;height:100%;" src='+src+'></iframe>',
						closable:true
					}
				);
			}
		})
		$('a[title]').click(function(){
			var src = $(this).attr('title');//水浒.html
			var title = $(this).html();//沁园春·雪
			var tt = $('#tt').tabs('exists',title);
			if(src=='CloseTabs'){//关闭工作卡
				var tablist=$('#tt').tabs('tabs');
				$.messager.confirm('通知', '你确定要关闭所有工作卡吗?', function(r){
					if (r){
						for(var i = tablist.length-1;i>0;i--){
							$('#tt').tabs('close',i);
						}
					}
				});
			}else if(src=='Exit'){//退出
				window.location.href="<%= request.getContextPath() %>/UserController/Exit.action";
			}else if(tt){//选中
				$('#tt').tabs('select',title);
			}else{//新建
				$('#tt').tabs(
					'add',
					{
						title:title,
						content:'<iframe frameborder="0" style="width:100%;height:100%;" src='+src+'></iframe>',
						closable:true
					}
					);
			}	
		})
		
	})
</script>
</head>
<body bgColor="#f4ddff">

<div id="cc" class="easyui-layout" style="width:100%;height:610px;">  
    <div region="west" title="西" iconCls="icon-remove" split="false" cancelsplit="false" style="width:160px;">
		<div id="aa" class="easyui-accordion" fit="true">  
		    <div title="个人办公" iconCls="icon-save" selected="true" style="overflow:auto;padding:10px;">  
		       	<ul>
	       			<c:forEach items="${sessionScope.privilegeUserList}" var="privilegeUserList">
	       				<li><a href="#" title="${pageContext.request.contextPath }/${privilegeUserList.p_uri}">${privilegeUserList.p_name}</a></li>
	       			</c:forEach>
		       		<li><a href="#" title="CloseTabs">关闭工作卡</a></li>
		       		<li><a href="#" title="Exit">退出</a></li>
		       	</ul>
		    </div>  
		    <div title="公司办公" iconCls="icon-reload" split="true" style="padding:10px;">  
		    </div>  
		</div>
    </div>  
    <div region="north" title="北" iconCls="icon-cancel" split="false" style="height:80px;">
    	欢迎【${user.uname}】光临，
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="#" title="${pageContext.request.contextPath }/GoodsController/findGoodsPage.action">手机商城</a>&nbsp;&nbsp;|&nbsp;
    	<a href="#" title="${pageContext.request.contextPath }/CarController/findAllUserCar.action">我的购物车</a>&nbsp;&nbsp;|&nbsp;
    	<a href="#" title="${pageContext.request.contextPath }/OrdersController/findUserOrders.action">我的订单</a>&nbsp;&nbsp;|&nbsp;
    </div>  
    <div region="center" title="中" split="false" style="padding:5px;background:#eee;">
    	<div id="tt" class="easyui-tabs" fit="true">

    	</div>
    </div>  
</div> 
</body>
</html>
