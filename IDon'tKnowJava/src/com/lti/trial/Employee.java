package com.lti.trial;

public class Employee {

	private final int empno;
	private String name;
	private static double salary;
	
	public static final String COMPANY_NAME = "LTI";
	
	public Employee(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Ram", 10000);
		Employee e2 = new Employee(1002, "Shyam", 20000);
		
		System.out.println(Employee.COMPANY_NAME);
		System.out.println(Math.PI);
		
		e1.empno = 2001;
		
		System.out.println(e1.salary);
		System.out.println(e2.salary);
	}
}
