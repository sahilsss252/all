package com.lti.appl.tests;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;
import com.lti.appl.services.EmpServices;

public class TestLayers1 {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmpServices services=ctx.getBean(EmpServices.class);
		try {
			ArrayList<Employee> emplist=services.getEmpList();
		
				for(Employee e:emplist){
				
				System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getEsal());
				}
				
				Employee e=services.getempDetails();
				System.out.println(e.getName());
				
				Employee e1=new Employee();
				e1.setName("Grishma");
				e1.setEmpno(786);
				e1.setEsal(78612);
				e1.setDeptno(10);
				services.joinEmp(e1);
				Employee e2=services.getempDetails();
				System.out.println(e.getName());
				
				
				
		} catch (HrExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		
	}

}
