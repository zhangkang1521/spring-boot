package org.zk.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zk.hello.HelloService;

@Controller
public class UserController {

	@Value("${test}")
	private String test;

	@Autowired
	private HelloService helloService;

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return helloService.getMsg();
	}
}
