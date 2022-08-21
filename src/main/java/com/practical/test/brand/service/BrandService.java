package com.practical.test.brand.service;

import java.util.List; 
import com.practical.test.brand.domain.Brand;
 
public interface BrandService {
    
    public List<Brand> getBrandList();
    public Brand getBrandById(Integer id);
    void saveBrand(Brand brand);
    void updateBrand(Integer id, Brand brand);
    void deleteBrand(Integer id);
}
