
function ond(){
	//获取每一行的元素
	var tr = document.getElementsByTagName("tr");
	//alert(tr.length)
	for(var i = 0;i<tr.length;i++){
		if(i%2==0){
			//如果是偶数行
			tr[i].style.backgroundColor="#ceedf9";	
		}else{
			//否则是奇数行
			tr[i].style.backgroundColor="FF7F50";	
		}
	}
}

//原来的颜色
var old = oldColor;
//进入事件
function omo(c){
	//获取当前行
	oldColor=c.style.backgroundColor;
	//给当前行赋值颜色
	c.style.backgroundColor = "#D2691E";
}

//离开事件
function omt(c){
	//当鼠标离开的时候，还原原来的颜色
	c.style.backgroundColor = oldColor;
}

