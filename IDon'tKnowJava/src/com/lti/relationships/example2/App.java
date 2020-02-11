package com.lti.relationships.example2;

public class App {

	public static void main(String[] args) {
		PhoneBook phBook = new PhoneBook(3);
		
		Entry e1 = new Entry();
		e1.setName("Nikhil");
		e1.setNumber("1234567890");
		e1.setEmail("nikhil@lti");
		phBook.add(e1);

		Entry e2 = new Entry();
		e2.setName("Dinesh");
		e2.setNumber("1234567890");
		e2.setEmail("dinesh@lti");
		phBook.add(e2);

		phBook.display();
		
	}
}
