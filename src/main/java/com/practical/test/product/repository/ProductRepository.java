package com.practical.test.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practical.test.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
