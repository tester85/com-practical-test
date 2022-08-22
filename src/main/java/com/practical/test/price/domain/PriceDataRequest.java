package com.practical.test.price.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.practical.test.brand.domain.Brand;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Value 
@Builder
@AllArgsConstructor
public class PriceDataRequest {
    Integer id;
    Brand brandId;
    @JsonFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    Date applicationDate; 
}
