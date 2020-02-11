package com.lti.testd;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dept.Department;
import com.lti.services.DeptService;

public class TestDept {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cctx=new ClassPathXmlApplicationContext("spring.xml");
		DeptService ds=cctx.getBean(DeptService.class);
		ArrayList<Department> dlst=ds.getDeptList();
		for(Department d: dlst){
			System.out.println(d.getDeptNo()+" "+d.getDeptName());
		}
	}
}
