package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


//@Entity
public enum TransactionType {	
	
	DEBIT("Debit"),CREDIT("Credit");
	
//	@Id
	private String type;

	private TransactionType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
