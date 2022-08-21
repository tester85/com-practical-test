package com.practical.test.price.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDtoResponse;

@Component
@Mapper(componentModel = "spring")
public class MapperPriceResponse {
 
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
    
    public PriceDtoResponse toDto(Price price){
        return PriceDtoResponse.builder()
        .productId(price.getProductId())
        .brandId(price.getBrandId())
        .priceList(price.getPriceList())
        .startDate(dateFormat.format(price.getStartDate()))
        .endDate(dateFormat.format(price.getEndDate()))
        .price(price.getPrice())
        .build();
    }
}
