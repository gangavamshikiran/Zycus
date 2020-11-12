package com.zycus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zycus.dao.EmployeeDAO;

//@Component
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
		System.out.println("EmployeeService Non-parameterized Constructor...");
		
	}
	public EmployeeService(EmployeeDAO employeeDAO) {
		super();
		System.out.println("EmployeeService Parameterized Constructor...");
		this.employeeDAO = employeeDAO;
	}
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	

}
