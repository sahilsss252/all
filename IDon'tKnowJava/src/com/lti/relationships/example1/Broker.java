package com.lti.relationships.example1;

public class Broker extends Person {

	private String businessName;
	private Address address;
	
	private Property[] properties = new Property[999];
	private int count;

	public void addProperty(Property property) {
		properties[count++] = property;
	}
	
	public void displayPropertiesForSale() {
		for(int i=0; i<count; i++) {
			Owner owner = properties[i].getOwner();
			System.out.println(owner.getName());
			//similarly print other details of owner
			Address address = properties[i].getAddress();
			System.out.println(address.getCity());
			//similarly print other details of address
			if(properties[i] instanceof Shop) {
				Shop shop = (Shop) properties[i];
				System.out.println(shop.getLicenseNo());
			}
			else if(properties[i] instanceof Flat) {
				Flat flat = (Flat) properties[i];
				System.out.println(flat.getType());
			}			
		}
	}
	
	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}
	
	
	
}
