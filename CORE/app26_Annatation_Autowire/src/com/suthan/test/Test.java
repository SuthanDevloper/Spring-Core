package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.bean.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConext.xml");
		Student std =(Student) context.getBean("stdBean");
		std.getStudentDetails();

	}

}
