package com.practical.test.price.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "PRICE")
public class Price {
    
    @Id
    @Column(name = "ID", nullable = false)
    Integer id;

    @Column(name = "BRAND_ID", nullable = false)
    Integer brandId;

    @Column(name = "START_DATE")
    Date startDate;

    @Column(name = "END_DATE")
    Date endDate;

    @Column(name = "PRICE_LIST")
    Integer priceList;

    @Column(name = "PRODUCT_ID", nullable = false)
    Integer productId;

    @Column(name = "PRIORITY")  
    Integer priority;

    @Column(name = "PRICE", precision = 10, scale = 2)  
    Float price;

    @Column(name = "CURR", nullable = false, length = 3)
    String curr;
}
