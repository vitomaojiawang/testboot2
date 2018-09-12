package com.oaec.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableAutoConfiguration
@RestController//所有的处理器都以字符串的类型返回
public class TestController2 {
	
	@RequestMapping("/test.do")
	public String hello(){

		return "testController";
	}
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestController2.class, args);
	}

}
