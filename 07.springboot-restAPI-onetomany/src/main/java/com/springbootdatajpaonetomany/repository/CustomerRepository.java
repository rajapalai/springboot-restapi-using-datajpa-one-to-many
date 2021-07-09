package com.springbootdatajpaonetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.springbootdatajpaonetomany.entites.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{



	

}
