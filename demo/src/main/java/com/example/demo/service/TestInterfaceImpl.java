package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestInterfaceImpl implements TestInterface{

	@Override
	public void test() {
		System.out.println("===========test1");
	}

	@Override
	public void test1() {
		System.out.println("===========test2");
	}

}
