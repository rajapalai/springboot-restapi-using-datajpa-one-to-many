package com.springbootdatajpaonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpaonetomany.entites.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{

}
