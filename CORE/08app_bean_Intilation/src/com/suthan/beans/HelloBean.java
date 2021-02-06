package com.suthan.beans;

import org.springframework.context.annotation.Bean;

public class HelloBean {

	//@Bean 
	 private  HelloBean( ) {
		System.out.println("BEAN Instatination ");
	}
}
