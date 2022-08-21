package com.practical.test.brand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practical.test.brand.domain.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    
}
