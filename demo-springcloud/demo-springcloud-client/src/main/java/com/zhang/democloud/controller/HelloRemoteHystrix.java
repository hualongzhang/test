package com.zhang.democloud.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		// TODO Auto-generated method stub
		return "hello" +name+", this messge send failed ";
	}

}
