package com.lti.app;

import org.springframework.stereotype.Component;
public class MyDao1 {
	
	private String cmpName; 
	private String cmpName1; 
	private MyDao2 dao2;
	public MyDao2 getDao2() {
		return dao2;
	}

	public void setDao2(MyDao2 dao2) {
		this.dao2 = dao2;
	}

	MyDao1() {
		// TODO Auto-generated constructor stub
		System.out.println("HELLO");
	}
	
	MyDao1(String cmpName) {
		// TODO Auto-generated constructor stub
		
		this.cmpName = cmpName;
		System.out.println(cmpName);
	}
	
	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public String getCmpName1() {
		return cmpName1;
	}

	public void setCmpName1(String cmpName1) {
		this.cmpName1 = cmpName1;
	}

	MyDao1(String cmpName,String cmpName1) {
		// TODO Auto-generated constructor stub
		
		this.cmpName = cmpName;
		System.out.println(cmpName);
		this.cmpName1= cmpName1;
		System.out.println(cmpName1);

	}

	@Override
	public String toString() {
		return "MyDao1 [cmpName=" + cmpName + ", cmpName1=" + cmpName1 + ", dao2=" + dao2.printmsg() +"]";
	}
}
