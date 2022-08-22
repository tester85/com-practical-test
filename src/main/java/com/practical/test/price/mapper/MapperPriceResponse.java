package com.practical.test.price.mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataResponse;

@Component
@Mapper(componentModel = "spring")
public class MapperPriceResponse {
 
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
    
    public PriceDataResponse toResponse(Price price){
        return PriceDataResponse.builder()
        .productId(price.getProductId().getId())
        .brandId(price.getBrandId().getId())
        .priceList(price.getPriceList())
        .startDate(dateFormat.format(price.getStartDate()))
        .endDate(dateFormat.format(price.getEndDate()))
        .price(price.getPrice())
        .build();
    }
}
