package com.lti.relationships.example3;

public class Developer extends Employee {

	private double overtime;

	@Override
	public double getSalary() {
		return super.getSalary() + getOvertime() * 500;
	}
	
	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	
	
}
