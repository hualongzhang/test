package com.zhang.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 该类的主要作用是加载beans.xml文件
 */
public class ServiceProvinderCore {
	protected ApplicationContext ctx;
	
	/**
	 * @param filename  beans.xml
	 */
	public void load(String filename){
		ctx=new ClassPathXmlApplicationContext(filename);
	}
}
