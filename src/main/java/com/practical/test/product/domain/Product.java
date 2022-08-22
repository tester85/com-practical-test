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
@Table(name = "product")
public class Product {
    
    @Id
    @Column(name = "id")
    Integer id;
    @Column(name = "product")
    String product;
    
}
