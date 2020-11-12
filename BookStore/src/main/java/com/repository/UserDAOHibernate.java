package com.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.graph.CannotContainSubGraphException;

import com.entities.User;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class UserDAOHibernate {
	
	private SessionFactory sessionFactory;
	
	public UserDAOHibernate() {
		// TODO Auto-generated constructor stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        this.sessionFactory =  cfg.buildSessionFactory();
	}
	
	public void close() {
		sessionFactory.close();
	}
	
	public User create(User user) {
		Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return user;
	}
	
	public User update(User user) {
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		return user;
				
	}
	
	
	
	public User delete(Long id) {
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		User user = session.find(User.class, id);
		session.delete(user);
		session.getTransaction().commit();
		return user;
	}
	
	public User get(long id) {
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		User user = session.find(User.class, id);
		session.getTransaction().commit();
		
		return user;
		
	}
	
	

}
