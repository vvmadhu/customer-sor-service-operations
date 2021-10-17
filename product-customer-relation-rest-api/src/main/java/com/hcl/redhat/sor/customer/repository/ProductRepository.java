package com.hcl.redhat.sor.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.redhat.sor.customer.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
	Optional<Product> findById(String id);
}