package com.tata.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil{
	
	private static ApplicationContext ctx;
	public static void init(String path){
		ctx=new ClassPathXmlApplicationContext(path);
	}  
	
	public static Object getBean(String id){
		return ctx.getBean(id);
	}
	
	public static <T> T getBean(Class<T> type){
		
		return ctx.getBean(type);
	}
	
}
