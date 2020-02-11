package com.lti.objectclass;

public class Employee {

	private int empno;
	private String name;
	private double salary;
	
	public Employee(int empno, String name, double salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if(this.empno == emp.empno && this.name == emp.name && this.salary == emp.salary)
			return true;
		return false;
	}
	
}
