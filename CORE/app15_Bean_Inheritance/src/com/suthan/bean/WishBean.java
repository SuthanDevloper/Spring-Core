package com.suthan.bean;

public class WishBean {

	private String wish_message;
	private String name;
	
	public void init() {
		System.out.println("init -wish bean method");
	}
	
	public void destroy() {
		System.out.println("destroy - wish - bean method");
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
	
	public String saywish() {
		return wish_message+" "+name+"!";
	}
	
}
