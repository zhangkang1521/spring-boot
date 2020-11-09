package org.zk.springboot.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.zk.springboot.demo.controller.UserController;
import org.zk.springboot.demo.entity.User;

@Configuration
@PropertySource("classpath:demo.properties")
public class MyConfig {

	@Value("${test}")
	private String test;


	@Bean
//	@ConditionalOnProperty(value = "hello.world")
//	@ConditionalOnClass(name = {"org.zk.springboot.demo.controller.XXX"})
	@ConditionalOnBean(value = {UserController.class})
	public User user() {
		User user = new User();
		user.setId(2);
		return user;
	}
}
