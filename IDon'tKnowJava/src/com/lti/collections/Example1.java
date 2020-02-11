package com.lti.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		//angular bracket notation <> is referred to as Generics in Java
		List<String> list2 = new ArrayList<String>();
		list2.add("C");
		list2.add("C++");
		
		//List<String> list1 = new LinkedList<String>(list2);
		List<String> list1 = new LinkedList<String>();
		list1.addAll(list2);
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("Python");
		list1.add("Java");
		
		//list1.set(2, "PHP");
		//list1.add(100);
		
		//traditional for-loop
		for(int i=0; i<list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(str);
		}
		
		//modern for-each loop
		for(String str : list1)
			System.out.println(str);
		
		//lambda style for-each
		list1.forEach(str -> System.out.println(str));
		
		//traditional Iterator approach
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			//if(str.equals("Python"))
				//itr.remove();
			System.out.println(str);
		}
		
		/*int[] arr = { 10, 20, 30 };
		for(int no : arr)
			System.out.println(arr);*/
		
	}
}
