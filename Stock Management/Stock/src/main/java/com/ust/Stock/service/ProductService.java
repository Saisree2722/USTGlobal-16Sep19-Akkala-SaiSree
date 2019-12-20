package com.ust.Stock.service;

import java.util.List;

import com.ust.Stock.dto.Products_info;

public interface ProductService 
{
	public boolean addProduct(Products_info bean);
	public boolean modifyProduct(Products_info bean);
	public Products_info getProductById(int id);
	public Products_info getProductByName(String name);
	public List<Products_info> getProductByCategory(String category);
	public Products_info getProductByCompany(String company);
	public List<Products_info> getAllProduct();
}
