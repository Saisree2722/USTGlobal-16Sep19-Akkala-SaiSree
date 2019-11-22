package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.onetoonemapping.Voter_Card;
import com.ustglobal.onetomanyormanytoone.Pencil;
import com.ustglobal.onetomanyormanytoone.PencilBox;

public class TestOneToMany
{
	public static void main(String[] args) 
	{
		PencilBox pBox = new PencilBox();
		pBox.setBid(2);
		pBox.setBname("Apsara");

		Pencil pencil = new Pencil();
		pencil.setPid(12);
		pencil.setColor("black");
		pencil.setPencilBox(pBox);

		Pencil pencil1 = new Pencil();
		pencil1.setPid(13);
		pencil1.setColor("Red");
		pencil1.setPencilBox(pBox);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();			
			entityManager.persist(pencil);
			entityManager.persist(pencil1);

			System.out.println("Record Saved");
			entityTransaction.commit();

		}catch(Exception e)
		{				
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
