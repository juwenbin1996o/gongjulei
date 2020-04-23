package com.bw.juwenbin.util;

import java.util.Date;

public class DateUtil {

	//日期工具类
	public static Date random(Date min ,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
	
		long t = (long) (Math.random() * (t2 -t1) + t1);
		return new Date(t);
		
	}
}
