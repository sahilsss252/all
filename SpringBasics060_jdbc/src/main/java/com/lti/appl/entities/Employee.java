package com.lti.appl.entities;


public class Employee {

	private int empno;
	private String name;
	private float esal;
	private int deptno;
	
	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public Employee() {
		super();
	}
	
	
	public Employee(int empno, String name, float esal,int deptno) {
		super();
		this.empno = empno;
		this.name = name;
		this.esal = esal;
		this.deptno=deptno;
		
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
		return "Employee [empno=" + empno + ", name=" + name + ", esal=" + esal + ", deptno=" + deptno + "]";
	}


//	@Override
//	public String toString() {
//		return "Employee [empno=" + empno + ", name=" + name + ", esal=" + esal + "]";
//	}
	
	
	
}
