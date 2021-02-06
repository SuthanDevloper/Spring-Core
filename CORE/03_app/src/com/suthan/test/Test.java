package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.suthan.bean.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee bean = (Employee) context.getBean("employeebean");
		Employee bean1 = (Employee) context.getBean("employeebean");
		Employee bean2 = (Employee) context.getBean("employeebean");
		
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println(bean2);
	
	
		ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee bean3 = (Employee) context1.getBean("employeebean");
		Employee bean4= (Employee) context1.getBean("employeebean");
		Employee bean5 = (Employee) context1.getBean("employeebean");
		
		System.out.println(bean3);
		System.out.println(bean4);
		System.out.println(bean5);
		//bean.displayemp();
	}

}
