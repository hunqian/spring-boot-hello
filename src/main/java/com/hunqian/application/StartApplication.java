package com.hunqian.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //启动spring boot的自动配置等
@RestController //区别于Controller
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
	
	@RequestMapping("hw")
	public String hello(){
		return "hello world！！";
	}
	
}
