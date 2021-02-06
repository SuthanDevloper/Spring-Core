package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.bean.HelloBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			HelloBean bean = (HelloBean) context.getBean("hellobean");
//bean.setName("suthanji");
			String message =bean.sayBean();
			System.out.println(message);
			
			
	}

}