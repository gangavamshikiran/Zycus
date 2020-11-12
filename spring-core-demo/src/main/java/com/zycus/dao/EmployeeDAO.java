package com.zycus.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeDAO {
	
	
	@Value("SomeDriverClass")
	private String driverClass;
	
	@Value("Some URL")
	private String url;
	
	@Value("Some Username")
	private String username;
	
	@Value("Some Password")
	private String password;
	
	
	
	public EmployeeDAO(){
		System.out.println("\n Employee DAO - Non-Parameterized Constructor is called..");
		
	}
	
	public void saveEmployee() {
		System.out.println("Employee Saved");
	}

	public EmployeeDAO(String driverClass, String url, String username, String password) {
		
		
		super();
		System.out.println("\n Employee DAO - Parameterized Constructor is called..");
		this.driverClass = driverClass;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "\n\tEmployeeDAO [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
	
	

}
