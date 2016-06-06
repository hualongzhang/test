package com.zhang.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 创建Spring 容器
 * 
 * @author Cui Bowen
 *
 */
public class ServiceProvinder {
	private static ServiceProvinderCore sc;
	
	static{
		sc=new ServiceProvinderCore();
		sc.load("beans.xml");
	}
	
	//从容器中取到Bean实例
	public static Object getService(String beanName){
		if(StringUtils.isBlank(beanName)){
			throw new RuntimeException("您要访问的服务名称不能为�?");
		}
		Object bean=null;
		
		//如果spring容器中包含beanName
		if(sc.ctx.containsBean(beanName)){
			bean=sc.ctx.getBean(beanName);
		}
		
		//如果spring容器中不包含beanName
		if(bean==null){
			throw new RuntimeException("您要访问的服务名称["+beanName+"]不存�?");
		}
		
		return bean;
	}

}
