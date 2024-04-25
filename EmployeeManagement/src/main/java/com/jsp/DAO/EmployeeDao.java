package com.jsp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Employee;


@Repository
public class EmployeeDao 
{
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	//to insert employee object to DB
	public void saveEmployee(Employee employee)
	{
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	
	//to find employee based on ID
	public Employee getEmployeeById(int id)
	{
		Employee emp=manager.find(Employee.class, id);
		return emp;
	}
	
	//to delete an employee
	public void deleteEmployee(int id)
	{
		Employee emp=manager.find(Employee.class, id);
		if(emp!=null)
		{
			transaction.begin();
			manager.remove(emp);
			transaction.commit();
		}
	}
	
	//to update employee details
	public void updateEmployee(Employee emp)
	{
		transaction.begin();
		manager.merge(emp);
		transaction.commit();
	}
	
	//to get all employee details
	public List<Employee> getAllEmployee()
	{
		Query q=manager.createQuery("Select e from Employee e");
		List<Employee> employees=q.getResultList();
		return employees;
	}
}
