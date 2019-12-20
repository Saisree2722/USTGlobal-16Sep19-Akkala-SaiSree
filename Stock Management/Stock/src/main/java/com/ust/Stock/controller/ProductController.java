package com.ust.Stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Stock.dto.ProductResponse;
import com.ust.Stock.dto.Products_info;
import com.ust.Stock.service.ProductService;

@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
@RestController
public class ProductController 
{
	@Autowired
	private ProductService service;

	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody Products_info bean) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
		}
		return response;
	}//End of addProduct()

	@PutMapping(path = "/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyEmployee(@RequestBody Products_info bean) {
		ProductResponse response = new ProductResponse();
		if(service.modifyProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data modified the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified in the DB");
		}
		return response;
	}// End of modifyProduct()

	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductById(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		Products_info bean = service.getProductById(id);
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found int he DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Found int he DB");
		}
		return response;
	}//End of getProductById()

	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByName(@RequestParam("name") String name) {
		ProductResponse response = new ProductResponse();
		Products_info bean = service.getProductByName(name);
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found int he DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Found int he DB");
		}
		return response;
	}//End of getProductByName()

	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCompany(@RequestParam("company") String company) {
		ProductResponse response = new ProductResponse();
		Products_info bean = service.getProductByName(company);
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found int he DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Found int he DB");
		}
		return response;
	}//End of getProductByCompany()

	@GetMapping(path = "/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByCategory(@RequestParam("category") String category) {
		ProductResponse response = new ProductResponse();
		List<Products_info> bean = service.getAllProduct();
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found int he DB");
			response.setBean(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Found int he DB");
		}
		return response;
	}//End of getProductByCategory()

	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllEmployee(){
		ProductResponse response = new ProductResponse();
		List<Products_info> bean = service.getAllProduct();
		if(!bean.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found int he DB");
			response.setBean(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Found int he DB");
		}
		return response;
	}//End of getAllEmployee()

	@GetMapping(path = "/exec",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int  i = 1/0;
	}
}
