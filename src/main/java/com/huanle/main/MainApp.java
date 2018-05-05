package com.huanle.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huanle.service.UserService;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)ctx.getBean("userService");
		
		System.out.println(service.getUserDAO());
	}
}
