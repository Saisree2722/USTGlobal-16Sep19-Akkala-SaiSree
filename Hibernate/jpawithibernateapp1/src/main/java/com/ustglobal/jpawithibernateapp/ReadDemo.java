package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReadDemo 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 101);
		System.out.println("ID---"+productDetail.getPid());
		System.out.println("Name--"+productDetail.getPname());
		System.out.println("Quantity--"+productDetail.getQuantity());
        entityManager.close();
		
	}// End of main()
}// End of class
