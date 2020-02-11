package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

import com.lti.edao.GenericDao;
import com.lti.entity.Account;
import com.lti.entity.AccountTransaction;
import com.lti.service.AccountService;

public class AccountTest {

	@Test
	public void test() {
		Account acc = new Account();
		acc.setName("Chinmay");
		acc.setBalance(9000);
		acc.setType("Saving");
		
		AccountService accountService=new AccountService();
		accountService.openAccount(acc); 
	}
	@Test
	public void withdrawmoney() {

	AccountService as=new AccountService();
	
	as.withdraw(80, 5000);

	
	
	}
	@Test
	public void depositmoney() {

		AccountService as=new AccountService();
		
		as.deposit(80, 5000);

		
		
		}
	@Test
	public void transfermoney() {

		AccountService as=new AccountService();
		
		as.transfer(80,82,2000);

		
		
		}
	@Test
	public void checkbalance() {

		AccountService as=new AccountService();
		
		as.checkBalance(80);

		
		
		}


}
