package com.lti.relationships.example1;

public class App {

	public static void main(String[] args) {
		Owner owner = new Owner();
		owner.setName("Ram");
		owner.setProfession("Software Engineer");
		owner.setAge(25);
		
		Flat flat = new Flat();
		flat.setOwner(owner);
		flat.setType("1 BHK");
		
		Address address = new Address();
		address.setCity("Mumbai");
		address.setLandmark("Behind Tajmahal Hotel");
		address.setPincode(40001);
		flat.setAddress(address);
		
		Shop shop = new Shop();
		shop.setOwner(owner);
		shop.setLicenseNo(1234567890);
		shop.setAddress(address);
		
		Broker broker = new Broker();
		broker.setName("Rajesh Sharma");
		broker.setBusinessName("Ghar Daar");
		
		address = new Address();
		address.setCity("Mumbai");
		address.setLandmark("Behind Oberoi Hotel");
		address.setPincode(40001);
		broker.setAddress(address);

		broker.addProperty(shop);
		broker.addProperty(flat);
		
		broker.displayPropertiesForSale();
				
	}
}
