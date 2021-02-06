package com.suthan.bean;

public class WelcomeBean {
	
	static {
		System.out.println("bean static method ");
	}
	
	  WelcomeBean() {
		 System.out.println("contructor ");
	}
	
	public String wish() {
		return "WELCOM TO SPRING";
	}
	
	
}
