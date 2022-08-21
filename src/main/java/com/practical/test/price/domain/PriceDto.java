package com.practical.test.price.domain;

import java.util.Date;

import com.practical.test.brand.domain.Brand;
import com.practical.test.product.domain.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;  
import lombok.Value; 

@Data
@Value 
@Builder
@AllArgsConstructor 
public class PriceDto { 
    Integer id; 
    Brand brandId; 
    Date startDate; 
    Date endDate; 
    Integer priceList; 
    Product productId; 
    Integer priority; 
    Float price; 
    String curr;
}
