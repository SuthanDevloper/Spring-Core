package com.suthan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.suthan.bean.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean= (HelloBean) context.getBean("hello");
		HelloBean bean1= (HelloBean) context.getBean("hello");
		HelloBean bean2= (HelloBean) context.getBean("hello1");
		HelloBean bean3= (HelloBean) context.getBean("hello1");
		
		System.out.println(bean);	
		System.out.println(bean1);
		
		System.out.println(bean2);
		System.out.println(bean3);
	}

}
