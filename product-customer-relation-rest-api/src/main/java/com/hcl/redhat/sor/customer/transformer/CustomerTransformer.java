
package com.hcl.redhat.sor.customer.transformer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.hcl.redhat.sor.customer.entity.Product;
import com.hcl.redhat.sor.customer.model.ProductModel;
import org.springframework.stereotype.Component;

import com.hcl.redhat.sor.customer.entity.Customer;
import com.hcl.redhat.sor.customer.model.CustomerModel;

@Component
public class CustomerTransformer {
	
	public CustomerModel transform(Customer customerEntity) {
		CustomerModel customer = new CustomerModel();
		if (null != customerEntity) {
			customer = new CustomerModel(customerEntity.getId(), customerEntity.getName(),
					customerEntity.getNumber(), customerEntity.getEmail(),
					customerEntity.getAddress(), customerEntity.getProduct().getId());
		}
		return customer;
	}

	public Customer transform(CustomerModel customerModel, Product product) {
		Customer customerEntity = new Customer(customerModel.getCustomerId(), customerModel.getCustomerName(), customerModel.getCustomerNumber(), customerModel.getCustomerEmail(), customerModel.getCustomerAddress());
		customerEntity.setProduct(product);
		return customerEntity;
	}
}
