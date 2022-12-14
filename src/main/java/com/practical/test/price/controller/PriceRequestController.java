package com.practical.test.price.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;
import com.practical.test.price.domain.PriceDataResponse;
import com.practical.test.price.mapper.MapperPriceResponse;
import com.practical.test.price.service.PriceService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/priceData")
public class PriceRequestController {
    
    private PriceService priceDataRequestService;  
    private MapperPriceResponse mapperPriceResponse;
    
    public PriceRequestController(PriceService priceDataRequestService, MapperPriceResponse mapperPriceResponse) {
        this.priceDataRequestService = priceDataRequestService;
        this.mapperPriceResponse = mapperPriceResponse;
    }

    @PostMapping
    public ResponseEntity<PriceDataResponse> requestPriceData(@RequestBody PriceDataRequest priceDataRequest){
        log.info("Requested Price Information");
        Price price = priceDataRequestService.getDataByPrice(priceDataRequest);
        return ResponseEntity.ok(mapperPriceResponse.toResponse(price)); 
    }
}
