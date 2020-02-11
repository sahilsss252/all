package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EMP")
public class Employee {
 
 	@Id  //primary key
 	@GeneratedValue // Auto Generated value
	private int psno;
	private String name;
	
	@Column(name ="DOJ")// to give name in table column 
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
