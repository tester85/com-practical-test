package com.practical.test.price.mapper;
  
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDtoRequest;

@Component
@Mapper(componentModel = "spring")
public class MapperPriceRequest {
 
    public PriceDtoRequest toDto(Price price){
        return PriceDtoRequest.builder()
        .id(price.getId())
        .brandId(price.getBrandId())
        .applicationDate(price.getStartDate())
        .build();
    }
    
}
