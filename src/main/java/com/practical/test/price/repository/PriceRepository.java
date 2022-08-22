package com.practical.test.price.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest; 

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
    List<Price> getDataByPrice(PriceDataRequest data);
}
