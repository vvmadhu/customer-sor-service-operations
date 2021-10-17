package com.hcl.redhat.sor.customer.model;

import java.util.List;

public class CustomerModel {
	private String customerId;
	private String customerName;
	private String customerNumber;
	private String customerEmail;
	private String customerAddress;
	private String productId;

	public CustomerModel() {
	}

	public CustomerModel(String customerId, String customerName, String customerNumber, String customerEmail, String customerAddress, String productId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.productId = productId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}