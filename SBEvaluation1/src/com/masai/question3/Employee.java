package com.masai.question3;

public class Employee {
	String empId;
	public Employee(String empId, String empName, Address address, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	String	empName;
	Address address;
	String email;
	 String 	password;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
