package com.lti.trial;

public class Hello {

	static {
		System.out.println("static initializer block of Hello class");
	}
	
	{
		System.out.println("non-static initializer1 block of Hello class");
	}

	{
		System.out.println("non-static initializer2 block of Hello class");
	}

	public Hello() {
		System.out.println("constructor of Hello class");
	}
	
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		
		//int[] arr;
		//int arr[];
		
		
	}
}
