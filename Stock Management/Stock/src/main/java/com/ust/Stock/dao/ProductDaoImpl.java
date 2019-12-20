package com.ust.Stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.Stock.dto.Products_info;

@Repository
public class ProductDaoImpl implements ProductDAO
{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Products_info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean modifyProduct(Products_info bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products_info bean1 = manager.find(Products_info.class, bean.getId());
			bean1.setCategory(bean.getCategory());
			bean1.setName(bean.getName());
			bean1.setQuantity(bean.getQuantity());
			bean1.setPrice(bean.getPrice());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public Products_info getProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Products_info.class, id);
	}

	@Override
	public Products_info getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products_info where name=:name";
			TypedQuery<Products_info> typedQuery = manager.createQuery(jpql, Products_info.class);
			typedQuery.setParameter("name", name);
			Products_info bean = typedQuery.getSingleResult();
			return bean;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Products_info> getProductByCategory(String category) 
	{
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product_info where category=:category";
		TypedQuery<Products_info> typedQuery = manager.createQuery(jpql, Products_info.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public Products_info getProductByCompany(String company) {

		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products_info where company=:company";
			TypedQuery<Products_info> typedQuery = manager.createQuery(jpql, Products_info.class);
			typedQuery.setParameter("company", company);
			Products_info bean = typedQuery.getSingleResult();
			return bean;
		}catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public List<Products_info> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products_info";
		TypedQuery<Products_info> typedQuery = manager.createQuery(jpql, Products_info.class);
		return typedQuery.getResultList();
	}
}
