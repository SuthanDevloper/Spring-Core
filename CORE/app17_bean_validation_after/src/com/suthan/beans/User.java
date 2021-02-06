package com.suthan.beans;

public class User {

	private String uname;
	private String upwd;
	private int age;
	private String uemail;
	private String umobile;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	
	public void getuserdetails() {
		System.out.println("user details");
		System.out.println("  ****************");
		System.out.println(uname);
		System.out.println(upwd);
		System.out.println(age);
		System.out.println(uemail);
		System.out.println(umobile);
		System.out.println();
		
		
	}
	
}
