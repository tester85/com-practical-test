package com.practical.test.brand.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Value;

@Value
@Entity
@Table(name = "BRAND")
public class Brand {
    @Id
    @Column(name = "ID")
    Integer id;
    @Column(name = "BRAND")
    String brand;    
}
