package com.suthan.beans;

public class Employee {
	
	
	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	
	public Employee(String eid,String ename ,float esal,  String eaddr) {
		this.eid=eid;
		this.ename =ename;
		this.esal =esal;
		this.eaddr = eaddr;
	}
	
	public void getDetails() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(eaddr);
	}
}
