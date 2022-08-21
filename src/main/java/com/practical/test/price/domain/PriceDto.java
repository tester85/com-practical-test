package com.practical.test.price.domain;

import java.util.Date;

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
    Integer brandId; 
    Date startDate; 
    Date endDate; 
    Integer priceList; 
    Integer productId; 
    Integer priority; 
    Float price; 
    String curr;
}
