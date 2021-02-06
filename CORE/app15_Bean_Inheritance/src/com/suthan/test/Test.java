package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.bean.HelloBean;
import com.suthan.bean.WelcomeBean;
import com.suthan.bean.WishBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		HelloBean hellobean = (HelloBean)context.getBean("helloBean");
		System.out.println(hellobean.sayHello());
		System.out.println("*********************");
		
		WelcomeBean welcomebean = (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(welcomebean.saywelcome());
		System.out.println("*********************");
		
//		WishBean wishbean = (WishBean)context.getBean("wishBean");
//	System.out.println(wishbean.saywish());
		
		System.out.println("*********************");
		
		context.registerShutdownHook();
		
	}

}
