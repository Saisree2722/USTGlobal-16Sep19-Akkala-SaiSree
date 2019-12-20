package com.ust.Stock.dto;

import java.util.List;

import com.ust.Stock.dto.Products_info;

public class ProductResponse
{
	private int statusCode;
	private String message;
	private String description;
	private List<Products_info> bean;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Products_info> getBean() {
		return bean;
	}
	public void setBean(List<Products_info> bean) {
		this.bean = bean;
	}
	
	
}
