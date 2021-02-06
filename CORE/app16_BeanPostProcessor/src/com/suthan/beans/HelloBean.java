package com.suthan.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean {

	
	private String name;
	static {  // class loading 
		System.out.println("hELLO BEAN LOADING by static method");
	}
	public HelloBean() { // constructor 
		
		System.out.println("Hello bean Ini by constructor ");
	}
	// settermethod
	public void setName(String name) {
		System.out.println("setting method ");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String sayHello() {
		return "wish"+name;
	}
	
	//customer init
	public void customerinit()  {
		System.out.println("customer Init");
	}
	// afterPropertiesSet() init
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterpropertir() - by InitializingBean -Interfcace");
		
	}
	// @PostConstruct () init
	@PostConstruct 
	public void postcontructinit() {
		System.out.println("@postcontruct - init ");
	}
	
	// custom destroy
	public void customedestroy() {
		System.out.println("customer destroy");
	}
	// 
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy - DisposableBean- Interfcace ");
		
	}
	@PreDestroy
	public void predestroy() throws Exception {
		System.out.println("destroy() -@predestroy ");
		
	}
	
}
