package com.lti.service;

import java.time.LocalDate;
import java.time.LocalDateTime;


import com.lti.edao.GenericDao;
import com.lti.entity.Account;
import com.lti.entity.AccountTransaction;

//classes containing business
//logic commonly referred to 
//as Service class


public class AccountService {
	//1.Check if the user has enough money to open an account
	//2.Store account details in the database if condition is met
	//3.Throw an exception if the above condition is not met
	//4.if the step2. executes successfully, then send an mail to the customer
	public void openAccount(Account acc){
		if(acc.getBalance()>=5000){
		GenericDao dao = new GenericDao();
		dao.save(acc);
		//code to send email will be here
		}
		else{
			//throw new Accountexception("Sorry, minimum balance needed")
		}
	}
	
	public void withdraw(long l , double amount){
		GenericDao dao=new GenericDao();
		Account account=(Account) dao.fetchByPK(Account.class, l);
		
		
		if(account.getBalance()>=amount){
			double oldbalance=account.getBalance();
			oldbalance-=amount;
			account.setBalance(oldbalance);
			dao.save(account);
			AccountTransaction accountTransaction=new  AccountTransaction();
			//Account account=new Account();
			accountTransaction.setAmt(amount);
			accountTransaction.setTxnDate(LocalDateTime.now());
			accountTransaction.setType("withdraw");
			
			
			accountTransaction.setAccount(account);
			dao.save(accountTransaction);
			
		}
		else
		{
			
		}
	}
	public void deposit(long acno , double amount){
		GenericDao dao=new GenericDao();
		Account account=(Account) dao.fetchByPK(Account.class, acno);
		double oldbalance=account.getBalance();
		oldbalance+=amount;
		account.setBalance(oldbalance);
		dao.save(account);
		AccountTransaction accountTransaction=new  AccountTransaction();
			//Account account=new Account();
		accountTransaction.setAmt(amount);
		accountTransaction.setTxnDate(LocalDateTime.now());
		accountTransaction.setType("deposit");
			
			
		accountTransaction.setAccount(account);
		dao.save(accountTransaction);
			
		
		
	}
	public void transfer(int fromAcno , int toAcno, double amount){
		AccountService as=new AccountService();
		as.withdraw(fromAcno, amount);
		as.deposit(toAcno, amount);
		
	}
	public void checkBalance(long acno){
		GenericDao dao=new GenericDao();
		Account account=(Account) dao.fetchByPK(Account.class, acno);
		System.out.println(account.getBalance());
	}
	
}
