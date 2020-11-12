package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Account;

@Repository("jpa")
@Component("jpa")
public class JpaAccountRepository implements AccountRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Account findAccountByNumber(Long accountNUmber) throws SQLException {
		// TODO Auto-generated method stub
		return entityManager.find(Account.class, accountNUmber);
	}

	@Override
	@Transactional
	public List<Account> findAllAccounts() throws SQLException {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("Select a from Account a",Account.class);
		List<Account> accountList = query.getResultList();
	
		return accountList;
	}

	@Override
	@Transactional
	public void save(Account account) throws SQLException {
		// TODO Auto-generated method stub

		entityManager.persist(account);

		
		
	}

	@Override
	@Transactional
	public void update(Account account) throws SQLException {
		// TODO Auto-generated method stub

		entityManager.merge(account);

		
		
	}

	@Override
	@Transactional
	public void delete(Account account) throws SQLException {
		// TODO Auto-generated method stub

		entityManager.remove(account);

	}

}
