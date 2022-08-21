package com.practical.test.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practical.test.product.domain.Product;

@Service
public interface ProductService {
    
    public List<Product> getProductList();
    public Product getProductById(Integer id);
    void saveProduct(Product product);
    void updateProduct(Integer id, Product product);
    void deleteProduct(Integer id);
}
