package com.suthan.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.suthan.bean.WelcomeBean;

public class Test {

	public static void main(String[] args) throws Exception {
		Resource  rs= new ClassPathResource("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(rs);
		BeanFactory bf1 = new XmlBeanFactory(rs);
		BeanFactory bf2 = new XmlBeanFactory(rs);
		WelcomeBean bean =(WelcomeBean) bf.getBean("welcome");	// now bean object created 
	
		WelcomeBean bean1 =(WelcomeBean) bf1.getBean("welcome");
		WelcomeBean bean2 =(WelcomeBean) bf2.getBean("welcome");
		
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println(bean2);
		String string = bean.wish(); ;// call the with method 
		
		System.out.println(string);
	}

}
