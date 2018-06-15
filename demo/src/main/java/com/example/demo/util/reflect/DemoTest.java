package com.example.demo.util.reflect;

import java.lang.reflect.Proxy;

public class DemoTest {

	public static void main(String[] args) {
		
		Hello hello=new HelloImpl();
		
		HelloDynamicProxy dynamicProxy = new HelloDynamicProxy(hello);

	    Hello helloProxy = (Hello) Proxy.newProxyInstance(
	        hello.getClass().getClassLoader(),
	        hello.getClass().getInterfaces(),
	        dynamicProxy
	    );
	    helloProxy.sayHello("123");
		//Hello hello1=dynamicProxy.getProxy();
		//hello1.sayHello("fdsfdas");
		System.out.println("==");	
	}
}
