package com.lti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmpDao dao = ctx.getBean("dao",EmpDao.class);// In this implicit typecasting is done
		//EmpDao dao2=ctx.getBean(EmpDao.class);//
		//System.out.println(dao.hashCode()+"dao");
		EmpDao dao1 = (EmpDao) ctx.getBean("dao");
		System.out.println(dao1.hashCode()+"dao1");
		//System.out.println(dao.getEmpList());
	}

}
