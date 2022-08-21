package com.practical.test.price.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDto;

@Component
@Mapper(componentModel = "spring")
public class MapperPrice {

    public PriceDto toDto(Price price){
        return PriceDto.builder()
        .id(price.getId()) 
        .brandId(price.getBrandId())
        .startDate(price.getStartDate())
        .endDate(price.getEndDate())
        .priceList(price.getPriceList())
        .productId(price.getProductId())
        .priority(price.getPriority())
        .price(price.getPrice())
        .curr(price.getCurr())
        .build();

    }
    
}
