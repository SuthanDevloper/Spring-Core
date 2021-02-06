package com.suthan.bean;

public class WelcomeBean {
	private String wish_message;
	private String name;
	
	public void init() {
		System.out.println("init -wecome bean method");
	}
	
	public void destroy() {
		System.out.println("destroy -wel come - bean method");
	}
	
	public String getWish_message() {
		return wish_message;
	}
	
	public void setWish_message(String wish_message) {
		this.wish_message = wish_message;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String saywelcome() {
		return wish_message+" "+name+"!";
	}
}
