package com.practical.test.price.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;
import com.practical.test.price.repository.PriceDataRequestRepository; 

@Service
public class PriceDataRequestServImpl implements PriceDataRequestService {

    private final PriceDataRequestRepository priceRequestRepository;

    public PriceDataRequestServImpl(PriceDataRequestRepository priceRequestRepository) {
        this.priceRequestRepository = priceRequestRepository;
    } 
    @Override
    public Price requestPriceData(PriceDataRequest data) {
        return priceRequestRepository.getPriceData(data)
        .stream().findFirst()
        .orElseThrow(NoSuchElementException::new); 
    }
    
}
