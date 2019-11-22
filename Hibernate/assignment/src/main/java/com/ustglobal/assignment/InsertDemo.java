package com.ustglobal.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Employee;

public class InsertDemo 
{
   public static void main(String[] args) 
   {
	 Employee employee = new Employee();
	 employee.setEid(120);
	 employee.setEname("Sai");
	 employee.setSalary(10000);
	 
	 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.persist(employee);
	 System.out.println("Record Saved");
	 //entityTransaction.commit();
	 entityManager.close();
   }// End of the main method
}// End of the class
