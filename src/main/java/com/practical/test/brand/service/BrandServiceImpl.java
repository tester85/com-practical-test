package com.practical.test.brand.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practical.test.brand.domain.Brand;
import com.practical.test.brand.repository.BrandRepository;
import com.practical.test.common.exception.ResourceNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepo;

    @Override
    public List<Brand> getBrandList() {
        log.info("getBrandList");
        return brandRepo.findAll();
    }

    @Override
    public Brand getBrandById(Integer id) {
        return brandRepo.findById(id)
        .orElseThrow(()-> new NoSuchElementException("Brand not found with id: "+id.toString()));
    }

    @Override
    public void saveBrand(Brand brand) {
        brandRepo.save(brand);

    }

    @Override
    public void updateBrand(Integer id, Brand brand) { 
        if(!id.equals(getBrandById(id).getId())){
            brandRepo.save(brand);
        }
        else throw new NoSuchElementException("Brand not found with id: "+id.toString());
    }

    @Override
    public void deleteBrand(Integer id) { 
        if(!id.equals(getBrandById(id).getId())){
            brandRepo.delete(getBrandById(id));
        }
        else throw new NoSuchElementException("Brand not found with id: "+id.toString());

    }

}
