package com.lti.relationships.example1;

public class Address {

	private String city;
	private int pincode;
	private String landmark;
	
	public Address() {
	}
	public Address(String city, int pincode, String landmark) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	
}
