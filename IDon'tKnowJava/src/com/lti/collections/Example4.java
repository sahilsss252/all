package com.lti.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int marks;
	
	Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		/*System.out.println(this);
		System.out.println(o);
		System.out.println("=====");*/
		//return this.marks - o.marks;
		//return this.name.compareTo(o.name);
		int order = this.name.compareTo(o.name);
		if(order == 0)
			order = this.marks - o.marks;
			if(order == 0)
				order = this.rollno - rollno;
		return order;
			
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}

public class Example4 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(543, "Ram", 50));
		list.add(new Student(123, "Shyam", 30));
		list.add(new Student(323, "Sita", 40));
		list.add(new Student(223, "Gita", 20));
		
		Collections.sort(list);
		
		for(Student student : list)
			System.out.println(student);
		
	}
}
