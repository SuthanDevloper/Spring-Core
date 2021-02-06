package com.suthan.beans;

public class HelloBean {
	
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

	public void init() {
		System.out.println("init - method");
	}

	public void destroy() {
	System.out.println("destroy - method");
	}
	public String sayHello() {
		return "hi"+name;
		//return "HELO USER";
	}
		
}
