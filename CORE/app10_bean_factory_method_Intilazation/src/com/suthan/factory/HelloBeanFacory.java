package com.suthan.factory;

import com.suthan.beans.HelloBean;

public class HelloBeanFacory {

	public HelloBean getInstance( ) {
		
		System.out.println("Instance factory method");
		//System.out.println();
		return new HelloBean();
}
}
