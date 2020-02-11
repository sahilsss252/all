package com.lti.app;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("dao")
@Scope("singleton")
public class EmpDaoImpl implements EmpDao,InitializingBean,DisposableBean  {
	private String companyName;
	
	@Value("LTI")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		System.out.println("setter called");
	}

	public EmpDaoImpl(){
		 System.out.println("Object EmpDaoImpl() created.");
	}

	public ArrayList<String> getEmpList() {
		// TODO Auto-generated method stub
		ArrayList<String> lst=new ArrayList<>();
		lst.add("chinamy");
		lst.add("sahil");
		lst.add("grishma");
		lst.add("akanksha");
		
		
		
		
		return lst;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After properties set called");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is before destroy");
	}
}
