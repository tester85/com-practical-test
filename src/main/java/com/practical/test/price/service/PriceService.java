package com.practical.test.price.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practical.test.price.domain.Price;

@Service
public interface PriceService {
    
    public List<Price> getPriceListed();
    public Price getPriceById(Integer id);
    void savePrice(Price price);
    void updatePrice(Price price);
    void deletePrice(Integer id);
}
