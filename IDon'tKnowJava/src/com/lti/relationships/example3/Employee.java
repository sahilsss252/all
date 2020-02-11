package com.lti.relationships.example3;

import java.time.LocalDate;

public class Employee {

	private int psno;
	private String name;
	private LocalDate dateOfJoining;
	private double salary;
	
	public int getPsno() {
		return psno;
	}
	public void setPsno(int psno) {
		this.psno = psno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
		
}
