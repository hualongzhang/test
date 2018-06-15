package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

	@Autowired
	TestInterface testInterface;
	
	public void test(){
		testInterface.test1();
	}
	
}
