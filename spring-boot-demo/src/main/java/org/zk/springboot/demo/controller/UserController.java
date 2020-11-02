package org.zk.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
//		if (true) {
//			throw new RuntimeException("ss");
//		}
		return "hello";
	}
}
