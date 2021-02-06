package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.beans.WishMassgeGenerator;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	WishMassgeGenerator emp = (WishMassgeGenerator)context.getBean("empbean");
	emp.getDetails();
	}

}
