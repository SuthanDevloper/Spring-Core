package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.suthan.beans.HelloBean;
import com.suthan.beans.WelcomeBean;
import com.suthan.config.BeanConfig;

public class Test {

	public static void main(String[] args) {
	//ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);// bean object creation 
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	// invalid .. If we provide Bean name in Beanconfig ..error messaage 
	//HelloBean h = ( HelloBean)context.getBean("helloBean"); // method name -->such as bean id
	// 
	
	//System.out.println(h.sayhello());
	
	
	
	HelloBean h2 = (HelloBean)context.getBean("bean1");
	//HelloBean h1 = (HelloBean)context.getBean("bean2");//such as bean name or name id 
	WelcomeBean wel = (WelcomeBean)context.getBean("welcome1"); // method name -->such as bean id
//	System.out.println(h);
	System.out.println(h2);
	System.out.println(wel.saywelcome()); 
	context.registerShutdownHook();
	}

}
