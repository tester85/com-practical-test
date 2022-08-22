package com.practical.test.price.domain;

import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.practical.test.brand.domain.Brand;
import com.practical.test.product.domain.Product;

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
@Table(name = "price")
public class Price {
    
    @Id
    @Column(name = "id", nullable = false)
    Integer id;
 
    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    Brand brandId;

    @Column(name = "start_date")
    Date startDate;

    @Column(name = "end_date")
    Date endDate;

    @Column(name = "price_list")
    Integer priceList;
 
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    Product productId;

    @Column(name = "priority")  
    Integer priority;

    @Column(name = "price", precision = 10, scale = 2)  
    Float price;

    @Column(name = "curr", nullable = false, length = 3)
    String curr;
}
