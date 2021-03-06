package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReAttaching 
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
		 Product product = entityManager.find(Product.class,101);
		 System.out.println(entityManager.contains(product));
		 entityManager.detach(product);
		 System.out.println(entityManager.contains(product));
		 Product product2 = entityManager.merge(product);
		 product2.setPname("mobile");
		 System.out.println("Record updated");
		 entityManager.clear();
		 System.out.println(entityManager.contains(product));
		 entityTransaction.commit();
	 }catch(Exception e ) {
		 e.printStackTrace();
		 entityTransaction.rollback();
	 }
	 entityManager.close();
  }
  
}
