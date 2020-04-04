package com.hcl.redhat.sor.customer.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hcl.redhat.sor.customer.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
	Iterable<Product> findByIdIn(Set<String> ids);
	Iterable<Product> findByNameContaining(String name);
	  
	/*
	 * @Query("select e from ProductEntity e where e.productName = ?1")
	 * Iterable<ProductEntity> findQuery(String name);
	 */
}