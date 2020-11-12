package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactiondetail")
public class TransactionDetail {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="transactionid")
	private Long transactionId;
	
	@Column(name="accountnumber")
	private Long accountNumber;
	
	@Column(name="transactiondate")
	private Date transactionDate;
	
	@Column(name="amount")
	private int amount;	
	
	
//	@OneToOne

	private TransactionType txType;
	
	
	
	
	public TransactionDetail( Long accountNumber,
			Date transactionDate, int amount, TransactionType type) {
		super();
		
		this.accountNumber = accountNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.txType = type;
	}
	
	public TransactionDetail() {
		
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public TransactionType getTxType() {
		return txType;
	}

	public void setTxType(TransactionType txType) {
		this.txType = txType;
	}
	
	
}
