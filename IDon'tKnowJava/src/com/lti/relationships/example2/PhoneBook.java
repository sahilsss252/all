package com.lti.relationships.example2;

public class PhoneBook {

	/*private String[] names;
	private String[] numbers;
	private String[] emails;*/
	
	private Entry[] entries;
	private int count;
	
	public PhoneBook() {
		entries = new Entry[100];
	}
	
	public PhoneBook(int noOfEntries) {
		entries = new Entry[noOfEntries];
	}
	
	public void add(Entry entry) {
		entries[count++] = entry;
	}
	
	public void display() {
		//TODO: write code here to display all the entries
		for(int i=0;i<count;i++) {
			System.out.println("Name   => " + entries[i].getName());
			System.out.println("Number => " + entries[i].getNumber());
			System.out.println("Email  => " + entries[i].getEmail());
			System.out.println("=================");
		}
	}

}
