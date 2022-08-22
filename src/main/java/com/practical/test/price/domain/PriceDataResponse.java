package com.practical.test.price.domain; 

import lombok.Builder;
import lombok.Value;

@Value 
@Builder
public class PriceDataResponse {
    Integer productId;
    Integer brandId;
    Integer priceList;
    String startDate;
    String endDate;
    Float price; 
}
