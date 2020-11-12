package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Employee;

public class EmployeeDAO {
	
	private EntityManagerFactory factory;
	private EntityManager manager;
	private EntityTransaction tx;
	
	public EmployeeDAO() {
		// TODO Auto-generated constructor stub
		factory = Persistence.createEntityManagerFactory("jpa-demo");
		
		manager = factory.createEntityManager();
		
		tx = manager.getTransaction();
	}
	public void createEmployee(Employee emp) {
		tx.begin();
		manager.persist(emp);
		tx.commit();
	}
	
	public Employee get(long id) {
		tx.begin();
		Employee employee=manager.find(Employee.class, id);
		tx.commit();
		
		return employee;
	}
	
	public Employee update(Employee e) {
		tx.begin();
		Employee employee=manager.find(Employee.class, e.getId());
		employee.seteName(e.geteName());
		employee.setCity(e.getCity());
		employee.setSalary(e.getSalary());
		tx.commit();
		
		return employee;
	}
	
	public void delete(long id) {
		tx.begin();
		
		manager.remove(manager.find(Employee.class, id));
		tx.commit();
	}
	

}
