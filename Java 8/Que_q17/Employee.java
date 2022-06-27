package Que_q17;

import java.time.LocalDate;

public class Employee {
	
	String ename;
	LocalDate dob;
	LocalDate doj;
	LocalDate doresign;
	String location;
	String dept;
	int salary;
	public Employee(String ename, LocalDate dob, LocalDate doj, LocalDate doresign, String location, String dept,
			int salary) {
		super();
		this.ename = ename;
		this.dob = dob;
		this.doj = doj;
		this.doresign = doresign;
		this.location = location;
		this.dept = dept;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDoresign() {
		return doresign;
	}
	public void setDor(LocalDate doresign) {
		this.doresign = doresign;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
