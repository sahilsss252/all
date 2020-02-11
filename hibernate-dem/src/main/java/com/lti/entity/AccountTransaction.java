package com.lti.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.bytebuddy.asm.Advice.Local;

@Entity
@Table(name="ACTxn")
public class AccountTransaction {
	
	@Id
	@GeneratedValue
	private int txnNO;
	@Column(name="Txntype")
	private String type;
	private double amt;
	private LocalDateTime txnDate;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Account account;

	public int getTxnNO() {
		return txnNO;
	}

	public void setTxnNO(int txnNO) {
		this.txnNO = txnNO;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public LocalDateTime getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDateTime localDateTime) {
		this.txnDate = localDateTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
