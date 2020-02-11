package com.lti.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//creating object of calculator class
		Calculator c = new Calculator();
		//same thing using Reflection API
		//Class cz = Calculator.class;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of the class to load : ");
		String classname = s.nextLine();
		
		//Date d = new Date();
		Class cz = Class.forName(classname);
		//Object obj = cz.newInstance();
		//System.out.println(obj);
		
		System.out.println("Following are the methods of  above class");
		Method[] methods = cz.getMethods();
		for(Method method : methods)
			System.out.println(method.getName());
		
	}	
}
