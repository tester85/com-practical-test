package com.practical.test.price.domain;

import com.practical.test.brand.domain.Brand;
import com.practical.test.product.domain.Product;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PriceDtoResponse {
    Product productId;
    Brand brandId;
    Integer priceList;
    String startDate;
    String endDate;
    Float price; 
}
