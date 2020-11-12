package com.service;

import java.util.List;

public interface Service<T> {
	public T create(T t) ;
	public T update(T t);
	public T get(Object o);
	public T delete(Object o);
	public List<T> listAll();
	public long count();
}
