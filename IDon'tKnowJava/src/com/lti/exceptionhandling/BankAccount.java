package com.lti.exceptionhandling;

public class BankAccount {

	private long acno;
	private double balance;
	
	public BankAccount(long acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}

	public double withdraw (double amount) throws Exception  {
		if(amount > balance) {
			Exception e = new Exception("Insufficient Balance");
			throw e;
		}
		else {
			balance -= amount;
			return balance;
		}
	}
	
	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount(12345, 5000);
		try {
			double balance = bankAcc.withdraw(6000);
			System.out.println("Balance left : " + balance);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
