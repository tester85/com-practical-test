package com.practical.test.price.repository;

import java.util.List;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;

public interface PriceDataRequestRepository {
  
    List<Price> getPriceData(PriceDataRequest priceDataRequest);

}
