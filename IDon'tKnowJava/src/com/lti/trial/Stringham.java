package com.lti.trial;

public class Stringham {

	public static void main(String[] args) {
		String str = "Majrul";
		char ch = str.charAt(0);
		
		String str1 = "Java";
		String str2 = "Java";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Java");
		String str4 = new String("Java");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String str5 = "JAVA";
		String str6 = str1.toUpperCase().intern();
		System.out.println(str5 == str6);
		
		//some logic using String concatenation
		String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String st = "";
		long ns1 = System.nanoTime();
		for(int i=0; i<s.length(); i++)
			for(int j=0; j<=i; j++)
				st = st + s.charAt(j);
		long ns2 = System.nanoTime();
		System.out.println(st);
		System.out.println("approx time taken : " + (ns2 - ns1) + " nanoseconds");
		
		//second version -- using StringBuffer
		StringBuffer sbf = new StringBuffer();
		ns1 = System.nanoTime();
		for(int i=0; i<s.length(); i++)
			for(int j=0; j<=i; j++)
				sbf.append(s.charAt(j));
		ns2 = System.nanoTime();
		System.out.println(sbf);
		System.out.println("approx time taken : " + (ns2 - ns1) + " nanoseconds");
		
		//second version -- using StringBuffer
		StringBuilder sbr = new StringBuilder();
		ns1 = System.nanoTime();
		for(int i=0; i<s.length(); i++)
			for(int j=0; j<=i; j++)
				sbr.append(s.charAt(j));
		ns2 = System.nanoTime();
		System.out.println(sbr);
		System.out.println("approx time taken : " + (ns2 - ns1) + " nanoseconds");
	}
}






