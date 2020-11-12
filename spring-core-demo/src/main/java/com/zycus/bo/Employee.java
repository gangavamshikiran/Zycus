package com.zycus.bo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee implements InitializingBean, DisposableBean{
	
	private String ename;
	
	private String city;
	
	public Employee() {
		System.out.println("Employee object is created...");
	}

	public Employee(String ename, String city) {
		super();
		this.ename = ename;
		this.city = city;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("setting name");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setting city");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", city=" + city + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("After Destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
//		System.out.println("After Property Set");
	}

}
