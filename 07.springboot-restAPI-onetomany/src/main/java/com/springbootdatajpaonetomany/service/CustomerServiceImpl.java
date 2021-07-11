package com.springbootdatajpaonetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdatajpaonetomany.entites.Customer;
import com.springbootdatajpaonetomany.exception.UserNotFoundException;
import com.springbootdatajpaonetomany.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public void deleteCustomer(long id) {
		customerRepository.findById(id);
		customerRepository.deleteById(id);
		
	}
	@Override
	public Customer updateCustomerById(Customer customer, long id) {
	Customer existingCustomer=	customerRepository.findById(id)
			.orElseThrow(()-> new UserNotFoundException("please enter a valid customer id"+id));
	existingCustomer.setFirstName(customer.getFirstName());
	existingCustomer.setLastName(customer.getLastName());
	existingCustomer.setEmail(customer.getEmail());
	existingCustomer.setGender(customer.getGender());
	existingCustomer.setOrderdate(customer.getOrderdate());
	existingCustomer.setCityName(customer.getCityName());
	existingCustomer.setDistrict(customer.getDistrict());
	existingCustomer.setZipCode(customer.getZipCode());
	existingCustomer.setProducts(customer.getProducts());
		customerRepository.save(existingCustomer);
		return existingCustomer;
	}
	
}
