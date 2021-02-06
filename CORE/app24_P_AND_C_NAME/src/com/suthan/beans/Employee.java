package com.suthan.beans;

public class Employee {

	private String eid;
	private String ename;
	private String esal;
	private String eaddr;
	
	private Account acc;

	public Employee(String eid, String ename, String esal, String eaddr, Account acc) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.acc = acc;
	}
	
	public void emploeeDetails() {
		System.out.println("Employee details");
		System.out.println("*****************");
		
		System.out.println("Employee Id   "+eid);
		System.out.println("Employee Name"+ename);
		System.out.println("Employee salary"+esal);
		System.out.println("Employee adress"+eaddr);
		System.out.println("Employee Account"+acc);
		
		
	}
	
}
