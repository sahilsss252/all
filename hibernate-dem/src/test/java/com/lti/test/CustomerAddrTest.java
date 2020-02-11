package com.lti.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.lti.edao.CutomerAddressDao;
import com.lti.entity.Address;
import com.lti.entity.Customer;

public class CustomerAddrTest {

	@Test
	public void addCustomer() {
		Customer c=new Customer();
		c.setName("sahil");
		c.setEmail("s@gmail.com");
		CutomerAddressDao dao= new CutomerAddressDao();
		dao.add(c);
		
	}
	@Test
	public void addAddressForExistingCutomers() {
		Address address=new Address();
		address.setCity("pune");
		address.setCountry("India");
		address.setZipcode(412115);
		CutomerAddressDao dao=new CutomerAddressDao();
		dao.addAddr(address);
		Customer c=dao.fetch(42);
		c.setAddress(address);
		dao.updateCust(c);
	}
	@Test
	public void addCustomerAlongWithAddress() {
		Customer c=new Customer();
		c.setName("sanju");
		c.setEmail("sanju@gmail.com");
		CutomerAddressDao dao=new CutomerAddressDao();
		//dao.add(c);
		Address addr=new Address();
		addr.setCity("amravati");
		addr.setCountry("India");
		addr.setZipcode(421655);
		//dao.addAddr(addr);
		//Customer c1=dao.fetch();
		c.setAddress(addr);
		//dao.updateCust(c);
		dao.add(c);
		
	}
	@Test
	public void fetchCustomerbyEmail() {
		
		CutomerAddressDao dao=new CutomerAddressDao();
		 List<Customer> lst=dao.fetchbyEmail("gmail");
		 for(Customer c:lst){
			 System.out.println(c.getCustId());
			 System.out.println(c.getName());
			 System.out.println(c.getEmail());
			 System.out.println(c.getAddress().getCity());
		 }
		
		
	}
	@Test
	public void fetchdata() {
		
		CutomerAddressDao dao=new CutomerAddressDao();
		 List<Customer> lst=dao.fetchDataByCity("pune");
		 for(Customer c:lst){
			 System.out.println(c.getCustId());
			 System.out.println(c.getName());
			 System.out.println(c.getEmail());
			 System.out.println(c.getAddress().getCity());
		 }
		
		
	}
	
}
