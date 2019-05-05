package com.yanzi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IDutil {
	
	//用于生成订单的id
	public static String getOrderID(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		return "orders-"+s;
	} 

}
