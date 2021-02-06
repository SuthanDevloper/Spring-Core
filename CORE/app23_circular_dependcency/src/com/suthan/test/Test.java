package com.suthan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suthan.beans.Branch;
import com.suthan.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("stdBean");
		System.out.println(student.getStudentName());
		
		Branch branch =(Branch)context.getBean("branchBean");
		System.out.println(branch.getBrancName());

	}

}
