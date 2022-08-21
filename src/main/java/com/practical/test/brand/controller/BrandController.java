package com.practical.test.brand.controller;

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

import com.practical.test.brand.domain.Brand;
import com.practical.test.brand.domain.BrandDto;
import com.practical.test.brand.mapper.MapperBrand;
import com.practical.test.brand.service.BrandService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/brand")
@Slf4j
public class BrandController {
 
    private BrandService brandService;
    private MapperBrand mapperBrand;

    public BrandController(BrandService brandService, MapperBrand mapperBrand) {
        this.brandService = brandService;
        this.mapperBrand = mapperBrand;
    }

    @GetMapping()
    @ResponseBody
    public List<BrandDto> getBrand() {
        log.info("BrandDto EndPoint");
        return brandService.getBrandList()
                .stream()
                .map(mapperBrand::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public BrandDto getGetBrandById(@PathVariable Integer id) {
        log.info("Brand search by ID EndPoint");
        Brand brand = brandService.getBrandById(id);
        return mapperBrand.toDto(brand);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBrand(@Valid @RequestBody Brand brand){
        log.info("Save Brand");
        brandService.saveBrand(brand);
    }

    @PostMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBrand(@PathVariable Integer id, @RequestBody Brand brand){
        log.info("Update Brand");
        brandService.updateBrand(id, brand);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBrand(@PathVariable Integer id){
        log.info("Delete Brand information ", id);
        brandService.deleteBrand(id);
    }
}
