package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.bean.HelloBean;

public class Test {

	public static void main(String[] args) {
		/* HelloBean hb = new HelloBean();
		hb.sayHello();  --> WRONG APROACH
		 SPRING FW ,,AUTOMATICLY BEAN OBJECT */
	ApplicationContext context = new ClassPathXmlApplicationContext("confgration.xml");
	HelloBean bean= (HelloBean) context.getBean("hello");
		bean.sayHello();
	
	}

}
