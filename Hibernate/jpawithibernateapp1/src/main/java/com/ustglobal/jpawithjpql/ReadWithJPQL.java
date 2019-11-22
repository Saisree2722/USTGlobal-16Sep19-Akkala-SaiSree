package com.ustglobal.jpawithjpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernateapp.dto.Product;

public class ReadWithJPQL 
{
  public static void main(String[] args) 
  {
	 
	 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * String jpql = "from Product"; Query query = entityManager.createQuery(jpql);
		 * 
		 * List<Product> products = query.getResultList(); for(Product product :
		 * products ) { System.out.println(product.getPid());
		 * System.out.println(product.getPname());
		 * System.out.println(product.getQuantity()); }
		 */
	 String jpql = "select pname from Product"; 
	 Query query = entityManager.createQuery(jpql);
	 List<String> products = query.getResultList(); 
	 for(String s :products )
	 {
		   System.out.println("Name is: "+s);
     }
	 
  }// End of main()
}// End of ReadWithJPQL class
