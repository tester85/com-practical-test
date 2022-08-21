package com.practical.test.product.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.product.domain.Product;
import com.practical.test.product.domain.ProductDto;
 
@Component
@Mapper(componentModel = "spring")
public class MapperProduct {
    
    public ProductDto toDto(Product product){
        return ProductDto.builder()
        .id(product.getId())
        .product(product.getProduct())
        .build();
    }
}
