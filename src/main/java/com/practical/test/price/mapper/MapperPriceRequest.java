package com.practical.test.price.mapper;
  
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;

@Component
@Mapper(componentModel = "spring")
public class MapperPriceRequest {
 
    public PriceDataRequest toRequest(Price price){
        return PriceDataRequest.builder()
        .productId(price.getProductId().getId())
        .brandId(price.getBrandId().getId())
        .applicationDate(price.getStartDate())
        .build();
    }
 
}
