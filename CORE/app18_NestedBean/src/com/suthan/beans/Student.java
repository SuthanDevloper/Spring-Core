package com.suthan.beans;

public class Student {

	private String sname;
	private String sid;
	private Course courses;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	
	public void getdetails() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(courses.getCid());
		System.out.println(courses.getCname());
		System.out.println(courses.getCost());
		
	}
}
