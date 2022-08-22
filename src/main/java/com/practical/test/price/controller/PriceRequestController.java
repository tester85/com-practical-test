package com.practical.test.price.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;
import com.practical.test.price.domain.PriceDataResponse;
import com.practical.test.price.mapper.MapperPriceRequest;
import com.practical.test.price.service.PriceDataRequestService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/priceData")
public class PriceRequestController {
    
    private PriceDataRequestService priceDataRequestService; 
    private MapperPriceRequest mapperPriceRequest;
    
    public PriceRequestController(PriceDataRequestService priceDataRequestService, MapperPriceRequest mapperPriceRequest) {
        this.priceDataRequestService = priceDataRequestService;
        this.mapperPriceRequest = mapperPriceRequest;
    }

    @PostMapping
    public ResponseEntity<PriceDataResponse> requestPriceData(@RequestBody PriceDataRequest priceDataRequest){
        log.info("Requested Price Information");
        // Price price = priceDataRequestService.requestPriceData(mapperPriceRequest.toDomain(priceDataRequest));
        return null;
    }
}
