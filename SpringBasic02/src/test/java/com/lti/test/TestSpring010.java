package com.lti.test;




import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.app.MyDao1;
import com.lti.app.MyDao2;

public class TestSpring010 {

	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("-----------------");
		MyDao1 dao=(MyDao1) ctx.getBean("md");
		
		MyDao1 dao1=(MyDao1) ctx.getBean("md");
		System.out.println(dao);
		System.out.println(dao1);
		MyDao2 dao3=(MyDao2) ctx.getBean("md2");
		dao3.printmsg();
		
	}
}
