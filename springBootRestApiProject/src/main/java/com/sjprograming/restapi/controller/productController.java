package com.sjprograming.restapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.sjprograming.restapi.entity.product;
import com.sjprograming.restapi.ropository.productRepository;

@RestController
public class productController { 
	
	productRepository repo;
	

	@GetMapping("/products")
	public List<product> getAllProduct(){
		List<product> products = repo.findAll();
		return products;
	}
	
	@GetMapping("/products/{id}")
	public product getProduct(@PathVariable int id) {
		product product = repo.findById(id).get();
		return null;
	}
	
	@PostMapping("/product/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createProduct(@RequestBody product product) {
		repo.save(product);
	
	}
      
	@PutMapping("/product/update/{id}")
	public product updateProducts(@PathVariable int id) {
		product product = repo.findById(id).get();
		product.setName("len");
		product.setProcategory(50);
		repo.save(product);
		return product;
		}
	
	@DeleteMapping("/product/update/{id}")
	public product removeProduct(@PathVariable int id) {
		product product = repo.findById(id).get();
	repo.delete(product);
	return product;
	
	}
}
	
	


