package com.lti.trial;

import java.time.LocalDate;

public class Calculator {

	public int add(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		System.out.println(result);
		result = Calculator.sub(10, 20);
		System.out.println(result);
		//LocalDate.now();
		System.out.println(Math.sqrt(4));
	}
	
	public static void main(int[] args) {
		
	}
}
