package com.suthan.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.beans.HelloBean;



public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	HelloBean hellobean =(HelloBean)context.getBean("helloBean");
		System.out.println(hellobean.sayHello());
	
		context.registerShutdownHook();
		

	}

}
