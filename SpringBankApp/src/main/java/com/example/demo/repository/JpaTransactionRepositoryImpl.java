package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.TransactionDetail;

@Repository("jpaTransaction")
@Component("jpaTransaction")
public class JpaTransactionRepositoryImpl implements TransactionRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public Long addTransaction(TransactionDetail transactionDetail) throws SQLException {
		// TODO Auto-generated method stub
		entityManager.persist(transactionDetail);
		return null;
	}

	@Override
	@Transactional
	public List<TransactionDetail> getAllTransactionDetailsByAccountNumber(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("Select a from TransactionDetail a where a.transactionId=? :t_id",TransactionDetail.class);
		query.setParameter("t_id",accountNumber);
		
		
		return query.getResultList();
	}

}
