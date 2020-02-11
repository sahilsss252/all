package com.lti.model;

public class Passenger {

	private String name;
	private int age;
	private Gender gender;
	private Status status;
	
	public static enum Gender{
		
		MALE,FEMALE,OTHERS;
	} 
	
	public static enum Status{
		WAITING,RAC,CONFIRMED;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
