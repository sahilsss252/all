package com.lti.appl.entities;


public class Employee {

	private int empno;
	private String name;
	private float esal;
	
	public Employee() {
		super();
	}
	
	
	public Employee(int empno, String name, float esal) {
		super();
		this.empno = empno;
		this.name = name;
		this.esal = esal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}


	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", esal=" + esal + "]";
	}
	
}
