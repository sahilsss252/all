package com.lti.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.lti.objectclass.Person;

public class Example2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Nikhil", 99));
		list.add(new Person("Dinesh", 99));
		list.add(new Person("Majrul", 99));
		
		for(Person person : list)
			System.out.println(person);
				
		System.out.println("==========================");
		
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("Nikhil", 99));
		set.add(new Person("Dinesh", 99));
		set.add(new Person("Majrul", 99));
		set.add(new Person("Majrul", 99));
		set.add(new Person("Gaurav", 99));
		
		/*for(Person person : set)
			System.out.println(person);*/
		
		
	}
}
