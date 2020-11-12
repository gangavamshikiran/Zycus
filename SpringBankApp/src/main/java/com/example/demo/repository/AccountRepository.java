package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entities.Account;


@Component
public interface AccountRepository {
	
	
	public Account findAccountByNumber(Long accountNUmber) throws SQLException;
	public List<Account> findAllAccounts() throws SQLException;
	public void save(Account account) throws SQLException;
	public void update(Account account)throws SQLException;
	public void delete(Account account) throws SQLException;
}
