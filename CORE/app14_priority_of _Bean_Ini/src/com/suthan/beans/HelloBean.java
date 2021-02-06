package com.suthan.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean  {
	private String name;
	public HelloBean(){
		System.out.println("Bean constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("anootation init - method");
	}

	@PreDestroy
	public void destroyanootation() {
	System.out.println("destroy -  destroyanootation method");
	}
	public void customInit() {
		System.out.println("custom inint method");
	}
	public void customDestroy() {
		System.out.println("custom destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()--interface");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println(" destroy()  --diposal--interface ");
		
	}
	
	public String sayHello() {
		return "hi"+name;
		//return "HELO USER";
	}
}
