package com.suthan.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean  {
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
	@PostConstruct
	public void init() {
		System.out.println("init - method");
	}

	@PreDestroy
	public void destroy() {
	System.out.println("destroy - method");
	}
	
	public String sayHello() {
		return "hi"+name;
	}

	
}
