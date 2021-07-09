package com.springbootdatajpaonetomany.entites;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "custome_tbl",uniqueConstraints = @UniqueConstraint(columnNames = "email_address",name = "email_unique"))
public class Customer {

	@Id
	@SequenceGenerator(name = "customer_sequence",sequenceName = "customer_sequence",allocationSize = 1)
	@GeneratedValue(generator = "customer_sequence",strategy = GenerationType.SEQUENCE)
	private Long customerId;
	private String firstName;
	private String lastName;
	
	@Column(name = "email_address",nullable = false)
	private String email;
	private String gender;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	private Date orderdate;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Products.class)
	@JoinColumn(name = "customer_id",referencedColumnName = "customerId")
	private List<Products> products;
	
	private String cityName;
	private String district;
	private Long zipCode;
	
}
