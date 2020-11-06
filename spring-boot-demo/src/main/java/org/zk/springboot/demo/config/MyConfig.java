package org.zk.springboot.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.zk.springboot.demo.entity.User;

@Configuration
@PropertySource("classpath:demo.properties")
public class MyConfig {

	@Value("${test}")
	private String test;

	@Bean
	public User user() {
		return new User();
	}
}
