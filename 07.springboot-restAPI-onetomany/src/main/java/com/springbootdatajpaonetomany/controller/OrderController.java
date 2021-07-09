package com.springbootdatajpaonetomany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootdatajpaonetomany.dto.OrderRequest;
import com.springbootdatajpaonetomany.entites.Customer;
import com.springbootdatajpaonetomany.exception.UserNotFoundException;
import com.springbootdatajpaonetomany.repository.CustomerRepository;
import com.springbootdatajpaonetomany.repository.ProductRepository;

@RestController
@RequestMapping("/api/flipkart_order")
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		return customerRepository.save(orderRequest.getCustomer());
		 
	}
	@GetMapping
	public List<Customer> getAllRecords(){
		return customerRepository.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable ("id") long customerId ) {
		return customerRepository.findById(customerId);		
	}

	
}
