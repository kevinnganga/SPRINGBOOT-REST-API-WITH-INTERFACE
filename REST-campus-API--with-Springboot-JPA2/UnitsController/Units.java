package com.example.demo.UnitsController;

public class Units {
	
	private String name;
	private int code;
	private String department;
	

	public Units() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Units(String name, int code, String department) {
		super();
		this.name = name;
		this.code = code;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Units [name=" + name + ", code=" + code + ", department=" + department + "]";
	}
	
	
}


