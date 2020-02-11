package com.lti.trial;

import java.time.LocalTime;

public class Greeting {

	public void greet(String name) {
		LocalTime time = LocalTime.now();
		int hh = time.getHour();
		if(hh >= 5 && hh < 12)
			System.out.println("Good Morning " + name);
		else if(hh >= 12 && hh < 16)
			System.out.println("Good Afternoon " + name);
		else if(hh >= 16 && hh < 21)
			System.out.println("Good Evening " + name);
		else
			System.out.println("Good Night " + name);
	}
}
