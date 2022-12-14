package com.practical.test.price.service;

import java.util.List;
  
import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest; 
 
public interface PriceService {
    
    public List<Price> getPriceListed();
    public Price getPriceById(Integer id);
    void savePrice(Price price);
    void updatePrice(Integer id, Price price);
    void deletePrice(Integer id);
    Price getDataByPrice(PriceDataRequest priceData);    

}
