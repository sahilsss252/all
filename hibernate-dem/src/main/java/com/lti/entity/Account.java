package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	@Id
	@GeneratedValue
	@Column(name="id")
	private long accountNo;
	private String name;
	@Column(name="Actype")
	private String type;
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<AccountTransaction> getAccountTransaction() {
		return accountTransaction;
	}

	public void setAccountTransaction(List<AccountTransaction> accountTransaction) {
		this.accountTransaction = accountTransaction;
	}

	private double balance;
	

	@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	private List<AccountTransaction> accountTransaction;
}
