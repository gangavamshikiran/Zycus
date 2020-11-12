package com.zycus;

import com.zycus.dao.EmployeeDAO;
import com.zycus.entities.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee emp = new Employee("aakash", "Pune", 2000.00);
       
		
		Employee emp1 = new Employee((long)1,"mohit","mumbai",1000.00);
		employeeDAO.saveEmployee(emp);
//		employeeDAO.removeEmployee(emp);
		employeeDAO.updateEmployee(emp1);
		
		

	}

}
