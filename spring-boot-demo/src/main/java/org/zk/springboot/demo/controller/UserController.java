package org.zk.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zk.hello.HelloService;
import org.zk.springboot.demo.entity.User;

@Controller
public class UserController {

	@Value("${test}")
	private String test;

	@Autowired
	private HelloService helloService;

	@Autowired
	private User user;

	@Autowired
	Environment env;

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return helloService.getMsg();
	}
}
