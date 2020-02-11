package com.lti.relationships.example3;

public class Payroll {

	private double bankBalance = 9999999999999999999999999.99;
	
	public void salaryDo(Employee emp) {
		bankBalance -= emp.getSalary();
		System.out.println("Salary of Rs " + emp.getSalary() +" issued to Employee with PSNO " + emp.getPsno());
	}
	
	public double getAvailableBalance() {
		return bankBalance;
	}
}
