package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class InsertDemo 
{
   public static void main(String[] args) 
   {
	 Product product = new Product();
	 product.setPid(104);
	 product.setPname("Pen");
	 product.setQuantity(10);
	 
	 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.persist(product);
	 System.out.println("Record Saved");
	 //entityTransaction.commit();
	 entityManager.close();
   }// End of the main method
}// End of the class
