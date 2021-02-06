package com.suthan.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.suthan.beans.HelloBean;
import com.suthan.beans.WelcomeBean;

@Configurable // It is optinal 
public class BeanConfig {
	
	@Bean  (name  = {"bean1","bean2","bean3"})  // such xml file bean id or name 
	@Scope("prototype")// Bean object craeted 
	
	//@Bean(initMethod="init", destroyMethod="destroy")
	public HelloBean helloBean() { // method name acting bean id 
		return new HelloBean();
	}
	@Bean  (name= {"welcome1","bean2","bean3"})  // such xml file bean id or name 
	@Scope("prototype")// Bean object craeted 
	
	//@Bean(initMethod="init", destroyMethod="destroy")
	public WelcomeBean  welcomeBean() {
		return new WelcomeBean();
	}

}
