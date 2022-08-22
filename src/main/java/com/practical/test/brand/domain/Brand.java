package com.practical.test.brand.domain;

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
@Table(name = "brand") 
public class Brand {
    @Id
    @Column(name = "id")
    Integer id;
    @Column(name = "brand")
    String brand;    
}
