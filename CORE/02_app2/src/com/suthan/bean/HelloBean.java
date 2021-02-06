package com.suthan.bean;

public class HelloBean {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayBean() {
		return "HI  "+name+ "!";
	}
}
