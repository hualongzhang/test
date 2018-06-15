package com.example.demo.util.reflect;

public class HelloStaticProxy implements Hello{

	private HelloImpl helloImpl;

    public HelloStaticProxy() {
        helloImpl = new HelloImpl();
    }

	@Override
	public void sayHello(String args) {
		// TODO Auto-generated method stub
		before();
		helloImpl.sayHello(args);
		after();
	}
	
	private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }

	@Override
	public void sayHello1(String args) {
		// TODO Auto-generated method stub
		
	}
    
}
