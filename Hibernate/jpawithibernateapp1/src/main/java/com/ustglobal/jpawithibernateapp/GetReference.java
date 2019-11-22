package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class GetReference 
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
//	  Product product = entityManager.getReference(Product.class,101);
	  Product product = entityManager.find(Product.class,101); 
	  System.out.println(product.getClass());
			
			  System.out.println("Id is--"+product.getPid());
			  System.out.println("Name is--"+product.getPname());
			  System.out.println("Salary is --"+product.getQuantity());
			 
		 
	  entityManager.close();
	 }catch(Exception e)
	 {
		 
	 }
	  
  }
}
