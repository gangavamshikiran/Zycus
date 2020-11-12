package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.entities.TransactionDetail;



public interface TransactionRepository {

	public Long addTransaction(TransactionDetail transactionDetail) throws SQLException;
	public List<TransactionDetail> getAllTransactionDetailsByAccountNumber(Long accountNumber) throws SQLException;
}
