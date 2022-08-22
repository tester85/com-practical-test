package com.practical.test.product.service;

import java.util.List;
import java.util.NoSuchElementException;
 
import org.springframework.stereotype.Service;
 
import com.practical.test.product.domain.Product;
import com.practical.test.product.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepo; 

    public ProductServiceImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getProductList() {
        log.info("getProductList");
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id)
        .orElseThrow(()-> new NoSuchElementException("Product not found with id: "+id.toString()));
    }

    @Override
    public void saveProduct(Product product) {
        productRepo.save(product);
        
    }

    @Override
    public void updateProduct(Integer id, Product product) {
        if(!id.equals(getProductById(id).getId())){
            productRepo.save(product);
        }
        else throw new NoSuchElementException("Product not found with id: "+id.toString());
        
    }

    @Override
    public void deleteProduct(Integer id) {
        if(!id.equals(getProductById(id).getId())){
            productRepo.delete(getProductById(id));
        }
        else throw new NoSuchElementException("Product not found with id: "+id.toString());
        
    }

}
