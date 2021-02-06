package com.suthan.beans;

public class Account {

	private String accNo;
	private String accName;
	private String accType;
	private long balance;
	public Account(String accNo, String accName, String accType, long balance) {
		
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.balance = balance;
	}
	
	public String toString() {
		return "["+accNo+","+accName+","+accType+","+balance+"]";
	}
	
	
}
