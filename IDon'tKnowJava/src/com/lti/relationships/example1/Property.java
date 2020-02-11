package com.lti.relationships.example1;

public class Property {

	private Owner owner; //has-a many-to-one
	
	private Address address; //has-a one-to-one

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
