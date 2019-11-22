package com.ustglobal.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.onetoonemapping.Person;
import com.ustglobal.jpawithibernate.onetoonemapping.Voter_Card;

public class TestOneToOne 
{
  public static void main(String[] args) 
  {
	  Voter_Card vc = new Voter_Card();
	  vc.setVid(101);
	  vc.setVname("Ram");

	  Person p = new Person();
	  p.setPid(1);
	  p.setName("Ram");
	  p.setVoterCard(vc);
	  
	 EntityManager entityManager = null;
	 EntityTransaction entityTransaction = null;
	   
	 try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Voter_Card vCard = entityManager.find(Voter_Card.class,101);
		System.out.println(vCard.getPerson().getPid());
		
//	    entityManager.persist(p);
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
