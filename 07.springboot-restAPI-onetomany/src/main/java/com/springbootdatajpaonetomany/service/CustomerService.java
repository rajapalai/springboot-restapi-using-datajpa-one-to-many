package com.springbootdatajpaonetomany.service;

import com.springbootdatajpaonetomany.entites.Customer;

public interface CustomerService {

	void deleteCustomer(long id);
	Customer updateCustomerById (Customer customer ,long id);
}
