package com.suthan.beans;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class WelcomeBean {

	
	public WelcomeBean() {
		System.out.println("welcome beans constructor ");
	}
	
	public String saywelcome() {
		return "welcome to spring";
	}
	public void init() {
		System.out.println("init - method - welcome bean");
	}

	public void destroy() {
	System.out.println("destroy - method -welcome bean");
	}
}
