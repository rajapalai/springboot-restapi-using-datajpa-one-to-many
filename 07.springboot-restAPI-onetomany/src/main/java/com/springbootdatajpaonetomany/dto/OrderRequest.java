package com.springbootdatajpaonetomany.dto;

import com.springbootdatajpaonetomany.entites.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

	private Customer customer;
}
