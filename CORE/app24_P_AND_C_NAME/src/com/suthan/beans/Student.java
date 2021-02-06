package com.suthan.beans;

public class Student {

	private String sid;
	private String sname;
	
	
	private Course course;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	public void getStudentDetails() {
		System.out.println("STUDENT DETAILS ");
		System.out.println("******************");
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(course.getCid());
		System.out.println(course.getCname());
		System.out.println(course.getCcost());
		
	}
}
