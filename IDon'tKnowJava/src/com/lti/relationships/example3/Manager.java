package com.lti.relationships.example3;

public class Manager extends Employee {

	private double incentives;

	@Override
	public double getSalary() {
		return super.getSalary() + getIncentives();
	}
	
	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	
	
}
