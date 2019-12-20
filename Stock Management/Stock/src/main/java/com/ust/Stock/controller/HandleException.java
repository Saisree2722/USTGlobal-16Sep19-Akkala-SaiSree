package com.ust.Stock.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ust.Stock.dto.ProductResponse;

@ControllerAdvice
public class HandleException 
{
	@ExceptionHandler(Exception.class)
	public @ResponseBody ProductResponse getException() {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
}
