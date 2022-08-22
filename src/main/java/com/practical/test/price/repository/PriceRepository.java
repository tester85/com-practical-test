package com.practical.test.price.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practical.test.price.domain.Price; 

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
    
}
