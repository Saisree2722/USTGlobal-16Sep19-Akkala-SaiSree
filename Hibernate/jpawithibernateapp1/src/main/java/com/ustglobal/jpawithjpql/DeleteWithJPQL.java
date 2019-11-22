package com.ustglobal.jpawithjpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteWithJPQL 
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

			String jpql = "delete from Product where pid='101'";
			Query query = entityManager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println(result+"Rows deleted");
			entityTransaction.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			  entityManager.close();
		  }
	}
}
