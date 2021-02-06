package co.suthan.bean;

public class Employee {

	public Employee() {
		System.out.println("Employee bean object creted");
	}
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	public void displayemp() {
		System.out.println("employee details");
		System.out.println("------------------------");
		System.out.println("employee id     : "+eno);
		System.out.println("employee namme  : "+ename);
		System.out.println("employee salary : "+esal);	
		System.out.println("employee addr   : "+eaddr);
	}
	
}
