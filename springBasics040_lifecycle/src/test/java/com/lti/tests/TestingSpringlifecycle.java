package com.lti.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.app.EmpDao;

public class TestingSpringlifecycle {
 
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmpDao dao=ctx.getBean("dao",EmpDao.class);
		dao.getEmpList();
		EmpDao dao2=ctx.getBean("dao1",EmpDao.class);
		//dao2.getEmpList();
		
		
		ConfigurableApplicationContext cctx= (ConfigurableApplicationContext) ctx;
		cctx.close();
	}
}
