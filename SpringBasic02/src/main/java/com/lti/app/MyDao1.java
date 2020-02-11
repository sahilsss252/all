package com.lti.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 
 * @author lntinfotech
 * The @component :Declares a bean for instantiation
 * the @Value: Mentions intial value for the field
 * @AutoWired: Injet the dependencyby default 'By Type'
 * @Qualifier: Need to qualify a bean for 'By Name' DI.
 */

@Component("md")
public class MyDao1 {
	
	@Value("LTI")
	private String cmpName; 
	@Value("mahape")
	private String cmpName1; 
	@Autowired //By Type injection of Mydao2
	@Qualifier("md2") //By Name injection of mydao2
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

//	@Override
//	public String toString() {
//		return "MyDao1 [cmpName=" + cmpName + ", cmpName1=" + cmpName1 + "]";
//	}
//	

	@Override
	public String toString() {
		return "MyDao1 [cmpName=" + cmpName + ", cmpName1=" + cmpName1 + ", dao2=" + dao2.printmsg() +"]";
	}
}
