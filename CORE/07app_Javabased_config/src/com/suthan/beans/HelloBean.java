package com.suthan.beans;

public class HelloBean {

	public HelloBean(){
		System.out.println(" bean object created by constructor");
	}
	public String sayhello() {
		return "hi suthan";
	}
	
	public void init() {
		System.out.println("init - method - hello bean");
	}

	public void destroy() {
	System.out.println("destroy - method -hello bean");
	}
}
