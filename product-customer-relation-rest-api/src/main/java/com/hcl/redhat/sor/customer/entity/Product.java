package com.hcl.redhat.sor.customer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity(name="product")
public class Product implements Serializable {

	@Id
	@Column(name="productId")
	private String id;
	
	@Column(name="productName")
	private String name;
	
	@Column(name="productSKU")
	private String sku;
	
	@Column(name="productCategoty")
	private String categoty;

	public Product() {
	}

	public Product(String id, String name, String sku, String categoty) {
		this.id = id;
		this.name = name;
		this.sku = sku;
		this.categoty = categoty;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCategoty() {
		return categoty;
	}

	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}
}