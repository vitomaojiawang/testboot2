package com.oaec.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oaec.pojo.User;
import com.oaec.service.IUserService;
@EnableAutoConfiguration
@Controller//所有的处理器都以字符串的类型返回
public class TestController {
	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/hello.do")
	public Map<String, Object> hello(){
		Map<String, Object> map = new HashMap<>();
		map.put("result1", true);
		map.put("result2", true);
		map.put("result3", false);
		map.put("result4", false);
		return map;
	}
	
	@RequestMapping("/index.do")
	public String index(Model model){
		List<User> users = userService.selectUsers();
		System.out.println(users);
		model.addAttribute("users", users);
		return "view/index";
	}
	
	@RequestMapping("/trans.do")
	public String trans(){
		User user = new User();
		user.setUser_name("maomaomao11");
		user.setUser_pwd("5555");
		user.setUser_type("0");
		user.setUser_extra("200");
		userService.insertUsers(user);
		return "forward:/index.do";
	}
	
	
	


}
