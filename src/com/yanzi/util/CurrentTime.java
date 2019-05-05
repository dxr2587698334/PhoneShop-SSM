package com.yanzi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
	
	public static String getCurrentTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		return s;
	} 

}
