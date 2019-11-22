package com.ustglobal.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Employee;

public class ReadDemo 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, 101);
		System.out.println("ID---"+employee.getEid());
		System.out.println("Name--"+employee.getEname());
		System.out.println("Quantity--"+employee.getSalary());
        entityManager.close();
		
	}// End of main()
}// End of class
