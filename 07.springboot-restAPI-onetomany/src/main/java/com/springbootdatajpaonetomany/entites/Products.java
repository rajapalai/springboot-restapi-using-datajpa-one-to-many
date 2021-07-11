package com.springbootdatajpaonetomany.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product_tbl",uniqueConstraints = @UniqueConstraint(columnNames = "product_id",name ="product_id_unique"))
public class Products {

	@Id
	@Column(name = "product_id",nullable = false)
	private Long productId;
	private String productName;
	private String quantity;
	private double price;
	private String productType;
	
}
