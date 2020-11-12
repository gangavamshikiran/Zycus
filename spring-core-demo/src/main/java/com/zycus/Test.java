package com.zycus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zycus.bo.Employee;
import com.zycus.dao.EmployeeDAO;
import com.zycus.services.EmployeeService;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		
//		EmployeeDAO employeeDAO = applicationContext.getBean(EmployeeDAO.class);
//		employeeDAO.saveEmployee();
		
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		
//		System.out.println(employeeService.getEmployeeDAO());
		
		Employee employee1 = applicationContext.getBean(Employee.class);
		Employee employee2 = applicationContext.getBean(Employee.class);
		
		
	}

}
