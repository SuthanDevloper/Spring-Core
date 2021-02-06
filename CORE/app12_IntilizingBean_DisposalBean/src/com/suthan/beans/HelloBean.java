package com.suthan.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean , DisposableBean { //InitializingBean, DisposableBean
private String name;
	
	public HelloBean(){
		System.out.println("Bean constructor");
	}
	
	public void setName(String name) {
		System.out.println("set name method ---");
		this.name = name;
	}
	
	public String getName() {
		System.out.println("get name method ---");
		return name;
	}

	
	public String sayHello() {
		return "hi"+name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println( " destroy()...  ");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println( " afterPropertiesSet()...  ");
		
	}

	
}
