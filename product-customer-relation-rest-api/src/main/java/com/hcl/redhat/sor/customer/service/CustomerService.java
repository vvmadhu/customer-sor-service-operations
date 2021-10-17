package com.hcl.redhat.sor.customer.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.redhat.sor.customer.entity.Customer;
import com.hcl.redhat.sor.customer.entity.Product;
import com.hcl.redhat.sor.customer.model.CustomerModel;
import com.hcl.redhat.sor.customer.repository.CustomerRepository;
import com.hcl.redhat.sor.customer.repository.ProductRepository;
import com.hcl.redhat.sor.customer.transformer.CustomerTransformer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Autowired
	CustomerTransformer customerTransformer;

	Logger logger = LoggerFactory.getLogger(CustomerService.class);

	public CustomerModel getCustomer(String customerId) {
		CustomerModel customer = null;
		Optional<Customer> customerEntity = null;
		
		if (null != customerId)
			customerEntity = customerRepository.findById(customerId);

		if (null != customerEntity) {
			customer = customerTransformer.transform(customerEntity.get());
		}

		return customer;
	}

	public String addCustomer(CustomerModel customerModel) {
		System.out.println("In service");
		Optional<Product> optionalProduct = productRepository.findById(customerModel.getProductId());

		if (optionalProduct.isPresent()) {
			System.out.println("Yes Product Found");
			Customer customerEntity = customerTransformer.transform(customerModel, optionalProduct.get());
			customerRepository.save(customerEntity);
			return "Customer Added";
		} else
			return "Customer Product Ref Missing";
	}

	public String updateCustomers(CustomerModel customerModel) {
		Optional<Product> optionalProduct = productRepository.findById(customerModel.getCustomerId());

		if (optionalProduct.isPresent()) {
			Customer customerEntity = customerTransformer.transform(customerModel, optionalProduct.get());
			customerRepository.save(customerEntity);
			return "Customer Updated";
		} else
			return "Customer Product Ref Missing";
	}

	public String deleteContents(String customerId) {
		customerRepository.delete(customerRepository.findById(customerId).get());
		return "Customer Deleted";
	}
}