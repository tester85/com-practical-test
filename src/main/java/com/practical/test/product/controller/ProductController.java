package com.practical.test.product.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practical.test.product.domain.Product;
import com.practical.test.product.domain.ProductDto;
import com.practical.test.product.mapper.MapperProduct;
import com.practical.test.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/product")
@Slf4j
public class ProductController {
 
    private ProductService productService;
    private MapperProduct mapperProduct;

    public ProductController(ProductService productService, MapperProduct mapperProduct) {
        this.productService = productService;
        this.mapperProduct = mapperProduct;
    }

    @GetMapping("/")
    @ResponseBody
    public List<ProductDto> getProduct() {
        log.info("ProductDto EndPoint");
        return productService.getProductList()
                .stream()
                .map(mapperProduct::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ProductDto getGetProductById(@PathVariable Integer id) {
        log.info("Product search by ID EndPoint");
        Product product = productService.getProductById(id);
        return mapperProduct.toDto(product);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@Valid @RequestBody Product product){
        log.info("Save Product");
        productService.saveProduct(product);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProduct(@PathVariable final Integer id, @RequestBody Product product){
        log.info("Update Product");
        productService.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Integer id){
        log.info("Delete Product information ", id);
        productService.deleteProduct(id);
    }


}
