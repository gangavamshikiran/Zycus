package com.service;

import java.util.List;

import com.model.User;
import com.repository.UserDAOjdbc;

public class UserService implements Service<User>{
	UserDAOjdbc userdao;
	public UserService(){
		userdao = new UserDAOjdbc();
	}
	@Override
	public User create(User t) {
		// TODO Auto-generated method stub
		
		return userdao.create(t);
	}
	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return userdao.update(t);
	}
	@Override
	public User get(Object o) {
		// TODO Auto-generated method stub
		return userdao.get(o);
	}
	@Override
	public User delete(Object o) {
		// TODO Auto-generated method stub
		return userdao.delete(o);
	}
	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userdao.listAll();
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userdao.count();
	}
	
	
}
