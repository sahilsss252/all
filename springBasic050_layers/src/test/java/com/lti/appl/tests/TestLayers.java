package com.lti.appl.tests;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.services.EmpServices;
import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;

public class TestLayers {

	public static void main(String[] args)  {
		ConfigurableApplicationContext cctx=new ClassPathXmlApplicationContext("spring.xml");
		EmpServices services=cctx.getBean("empService",EmpServices.class);
		
		try {
			ArrayList<Employee>lst=services.getEmpList();
		} catch (HrExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cctx.close();
	}
}
