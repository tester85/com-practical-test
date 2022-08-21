package com.practical.test.product.domain; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor; 

@Data
@Getter
@NoArgsConstructor  
@Entity
@Table(name = "PRODUCT")
public class Product {
    
    @Id
    @Column(name = "ID")
    Integer id;
    @Column(name = "PRODUCT")
    String product;
    
}
