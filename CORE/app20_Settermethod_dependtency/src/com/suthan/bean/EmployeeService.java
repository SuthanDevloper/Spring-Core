package com.suthan.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeService {

	static {
		System.out.println("Emplooyee class");
	}
	Connection con ;
	Statement st; 
	
	private String driver_Class;
	private String driver_URL;
	private String db_User_Name;
	private String db_Pwd;
	
	
	//ResultSet rs ;
	public String getDriver_Class() {
		return driver_Class;
	}
	public void setDriver_Class(String driver_Class) {
		this.driver_Class = driver_Class;
	}
	public String getDriver_URL() {
		return driver_URL;
	}
	public void setDriver_URL(String driver_URL) {
		this.driver_URL = driver_URL;
	}
	public String getDb_User_Name() {
		return db_User_Name;
	}
	public void setDb_User_Name(String db_User_Name) {
		this.db_User_Name = db_User_Name;
	}
	public String getDb_Pwd() {
		return db_Pwd;
	}
	public void setDb_Pwd(String db_Pwd) {
		this.db_Pwd = db_Pwd;
	}
	
	
	public void init() {
		
	try {
		Class.forName(driver_Class);
		 con = DriverManager.getConnection(driver_URL,db_User_Name,db_Pwd);
		 st = con.createStatement();
		
	} catch (Exception e) {
		e.printStackTrace();
		
	} 
	}
	public void getEmployeeDetails() {
		try {
			
			ResultSet rs = st.executeQuery("select * from emp1");
			System.out.println("ENO\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------");
			while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getFloat(3)+"\t");
			System.out.println(rs.getString(4));
			}
		}catch (Exception e) {
				e.getMessage();
		}
			
		}
	}

