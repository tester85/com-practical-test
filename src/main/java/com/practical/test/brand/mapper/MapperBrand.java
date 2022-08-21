package com.practical.test.brand.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.practical.test.brand.domain.Brand;
import com.practical.test.brand.domain.BrandDto;

@Component
@Mapper(componentModel = "spring")
public class MapperBrand {
    
    public BrandDto toDto(Brand brand){
        return BrandDto.builder()
        .id(brand.getId())
        .brand(brand.getBrand())
        .build();
    } 
}
