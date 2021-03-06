package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class DeleteDemo 
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
			Product product = entityManager.find(Product.class,102);
			entityManager.remove(product);
			System.out.println("Delete Record");
			entityTransaction.commit();
		}catch(Exception e){
			e.printStackTrace();	
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
