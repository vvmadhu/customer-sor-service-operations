package com.hcl.redhat.sor.customer.model;

import java.util.List;

public class ProductModel {
	private String productId;
	private String productName;
	private String productSKU;
	private String productCategory;
	private List<CustomerModel> customerModels;

	public ProductModel() {
	}

	public ProductModel(String productId, String productName, String productSKU, String productCategory, List<CustomerModel> customerModels) {
		this.productId = productId;
		this.productName = productName;
		this.productSKU = productSKU;
		this.productCategory = productCategory;
		this.customerModels = customerModels;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSKU() {
		return productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public List<CustomerModel> getCustomerModels() {
		return customerModels;
	}

	public void setCustomerModels(List<CustomerModel> customerModels) {
		this.customerModels = customerModels;
	}
}
