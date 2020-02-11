package com.lti.trial;

public class WrapperClasses {

	public static void main(String[] args) {
		int a = 10;
		Integer b = 10;
		Integer c = new Integer(10);
		
		a = 20;
		b = 20;
		
		Integer i = 1000;
		Integer j = 1000;
		//j = 200;
		System.out.println(i);
		System.out.println(i == j);
		
		float f1 = 10.10f;
		Float f2 = 10.10f;
		
		//common functions of wrapper classes
		
		//Converting String to int
		String s = "100";
		int si = Integer.parseInt(s);
		
		//Converting int to String
		int x = 100;
		String sx = Integer.toString(x); //OR String.valueOf(x);
		
		//Converting String to Integer
		String t = "100";
		Integer it = new Integer(t);
		
		//Converting Integer to String
		Integer m = 100;
		String ms = m.toString();
		
		//TRY : Converting Integer to long/Long
		
	}
}
