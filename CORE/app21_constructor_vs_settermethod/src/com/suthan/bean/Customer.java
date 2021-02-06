package com.suthan.bean;

public class Customer {
	
	public Customer() {
		System.out.println("construactor");
	}

	private String cid;
	private String cname;
	private String caddr;	
	public Customer(String cid, String cname, String caddr) {
	
		this.cid = cid;
		this.cname = cname;
		this.caddr = caddr;
		System.out.println("constructor ");
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	
	
}
