package com.ustglobal.jpawithjpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateWithJPQL 
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

			String jpql = "update Product set pname='watch' where pid='101'";
			Query query = entityManager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println(result+"Rows Updated");
			entityTransaction.commit();
			entityManager.close();
		}catch(Exception e)
		{
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}
}
