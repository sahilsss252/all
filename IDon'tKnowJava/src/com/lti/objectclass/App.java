package com.lti.objectclass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Majrul");
		p1.setAge(99);
		
		//System.out.println(p1.getName());
		//System.out.println(p1.getAge());
		System.out.println(p1); // cout << p1;
		
		Person p2 = new Person();
		p2.setName("Majrul");
		p2.setAge(99);
		
		System.out.println(p1 == p2); //reference comparison in case of objects
		System.out.println(p1.equals(p2)); //value comparison
		
		Employee e1 = new Employee(1001, "Majrul", 10000);
		Employee e2 = new Employee(1001, "Majrul", 10000);
	
		System.out.println(e1 == e2); 
		System.out.println(e1.equals(e2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
	}
}
