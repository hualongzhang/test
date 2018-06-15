package com.example.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.service.ServiceTest;

public class DemoUtils {
	
	
	
    public static void main(String[] args) throws Exception{
 
    	/***测试spring依赖注入 ***/
        ApplicationContext ac=new AnnotationConfigApplicationContext("com.example.demo.service");  
        ServiceTest serviceTest=ac.getBean(ServiceTest.class);
        serviceTest.test();
    	System.out.println("===============");
    	 
    }

}
