package com.dss.bean;

public class HelloBean {

	
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String sayHell() {
		return "hi "+name;
	}
}