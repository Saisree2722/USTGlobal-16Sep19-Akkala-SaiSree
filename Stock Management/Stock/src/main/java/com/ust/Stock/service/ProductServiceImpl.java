package com.ust.Stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Stock.dao.ProductDAO;
import com.ust.Stock.dto.Products_info;

@Service
public class ProductServiceImpl implements ProductService
{

	@Autowired
	public ProductDAO dao;

	@Override
	public boolean addProduct(Products_info bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(Products_info bean) {

		return dao.modifyProduct(bean);
	}

	@Override
	public Products_info getProductById(int id) {

		return dao.getProductById(id);
	}

	@Override
	public Products_info getProductByName(String name) {

		return dao.getProductByName(name);
	}

	@Override
	public List<Products_info> getProductByCategory(String category) {

		return dao.getProductByCategory(category);
	}

	@Override
	public Products_info getProductByCompany(String company) {

		return dao.getProductByCompany(company);
	}

	@Override
	public List<Products_info> getAllProduct() {

		return dao.getAllProduct();
	}

}
