package com.example.demo.repository;


import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Reward;

@Repository("jpaReward")
@Component("jpaReward")
public class JpaRewardRepositoryImpl implements RewardRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void addReward(Reward reward) throws SQLException {
		// TODO Auto-generated method stub
		if(reward!=null)
			entityManager.persist(reward);
		
	}

	@Override
	@Transactional
	public int getTotalRewardAmount(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select sum(r.rewardAmount) as sum from Reward r where accountNumber=:accountNumber");
		query.setParameter("accountNumber",accountNumber );
		return ((Long)query.getResultList().get(0)).intValue();
		
	
	}

	@Override
	@Transactional
	public List<Reward> getAllRewardsForAccount(Long accountNumber) throws SQLException {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select r.rewardAmount from Reward r where  accountNumber=:accountNumber");
		query.setParameter("accountNumber",accountNumber );
		return query.getResultList();
		
	}
	
	
}
