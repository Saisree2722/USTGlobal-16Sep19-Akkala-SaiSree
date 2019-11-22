package com.ustglobal.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Employee;

public class UpdateDemo
{
  public static void main(String[] args) 
  {
	  EntityManager entityManager = null;
	  EntityTransaction entityTransaction = null;
	  try {
	  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	  entityManager = entityManagerFactory.createEntityManager();
	  entityTransaction = entityManager.getTransaction();
	  entityTransaction.begin();
	  Employee employee = entityManager.find(Employee.class,120);
	  employee.setEname("Mobile");
	  System.out.println("Update Record");
	  entityTransaction.commit();
     } catch(Exception e) {
    	 e.printStackTrace();
    	 entityTransaction.rollback();
     }
	  entityManager.close();
	  
	  
  }
}
