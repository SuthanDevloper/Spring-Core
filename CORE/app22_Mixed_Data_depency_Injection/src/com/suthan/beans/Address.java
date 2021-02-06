package com.suthan.beans;

public class Address {

	private String pno;
	private String street;
	private String city;
	private String country;
	public Address(String pno, String street, String city, String country) {
		
		this.pno = pno;
		this.street = street;
		this.city = city;
		this.country = country;
		
		
	}
	
	 public String toString() {
		 return "["+pno+","+street+","+city+","+country+"]";
	 }
	
}
