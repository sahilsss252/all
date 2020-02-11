package com.lti.trial;

import java.time.LocalDate;

class Passport {

	Identity identity;
	LocalDate issueDate;
	LocalDate expiryDate;
	
	class Identity {

		String passportNo;
		String country;

	}
	
}


class Person {
	
	Identity identity;
	String name;
	int age;
	
	class Identity {
		long aadharCardNumber;
		String religion;
	}
	
}

@FunctionalInterface
interface Printer {
	void print();
}

interface Scanner {
	boolean scan();
}

class DotMatrixPrinter implements Printer {
	
	@Override
	public void print() {
		System.out.println("Printing done..");
	}
}


public class InnerClassAndLambda {

	public static void main(String[] args) {
		//new DotMatrixPrinter().print();
		Printer p = new DotMatrixPrinter();
		p.print();
		
		//revisiting inner classes
		class InkjetPrinter implements Printer {
			
			@Override
			public void print() {
				System.out.println("Printing done..");
			}
		}
		
		Printer pi = new InkjetPrinter();
		pi.print();
		
		//anonymous inner classes -- class without a name
		Printer pr = new Printer() {
			
			@Override
			public void print() {
				System.out.println("Printing done..");
			}
		};
		pr.print();
		
		//lambda expressions -- anonymous functions
		Printer pp = () -> {
			System.out.println("Printing done..");
		};
		pp.print();
		
		Scanner s = () -> {
			System.out.println("scanning done..");
			return true;
		};
		System.out.println(s.scan());
		
		/*class Hello {
			void hello() {
				System.out.println("hello");
			}
		}
		class Hi extends Hello {
			void hello() {
				System.out.println("hi");
			}
		}
		
		Hello h = new Hello() {
			void hello() {
				System.out.println("Namaste");
			}
		};*/
	}
}
