package com.suthan.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicatonContext.xml");
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println(bean.sayHello());
		context.registerShutdownHook(); 


	}

}
