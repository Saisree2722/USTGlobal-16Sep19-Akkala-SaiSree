package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ustglobal.springboot.dto.EmployeeResponse;

@ControllerAdvice
public class HandleException 
{
	@ExceptionHandler(Exception.class)
	public @ResponseBody EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
}
