package com.lti.threading;

class BankAccount {
	int acno;
	double balance;

	BankAccount(int acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}
	
	synchronized void withdraw(double amount) {
		try {
			Thread.sleep(100);
			if(amount < balance) {
				Thread.sleep(100);
				balance -= amount;
				Thread.sleep(100);
				System.out.println("Balance left " + balance);
			}
			else
				System.out.println("Insufficient Balance!");
		}
		catch(InterruptedException e) { }
	}
}

class Transaction implements Runnable {
	
	BankAccount bankAcc;
	
	Transaction(BankAccount bankAcc) {
		this.bankAcc = bankAcc;
	}

	@Override
	public void run() {
		//we need to call withdraw method
		bankAcc.withdraw(5000);
	}
}

public class Synchronization {

	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount(12345, 6000);
		Transaction tx1 = new Transaction(bankAcc);
		Transaction tx2 = new Transaction(bankAcc);
		Thread th1 = new Thread(tx1);
		Thread th2 = new Thread(tx2);
		th1.start();
		th2.start();
	}
}
