package com.suthan.beans;

public class HelloBean {
	
	// any modifier we can use ---spring use refLelection API
	private  HelloBean()   {
		System.out.println("bean instatanition instance ");
	}
	public static  HelloBean getInstance() {
		
		System.out.println("bean instatanition by static method");
		return new HelloBean();	
		
		
	}
	
	
	public String sayHello() {
		return "Hi suthan";
	}
}
