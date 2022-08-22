package com.practical.test.price.service;

import java.util.List;
import java.util.NoSuchElementException;
 
import org.springframework.stereotype.Service;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;
import com.practical.test.price.repository.PriceRepository; 

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PriceServiceImpl implements PriceService {
    
    PriceRepository priceRepo;
 
    public PriceServiceImpl(PriceRepository priceRepo) {
        this.priceRepo = priceRepo;
    }

    @Override
    public List<Price> getPriceListed() {
        log.info("getPriceList");
        return priceRepo.findAll();
    }

    @Override
    public Price getPriceById(Integer id) {
        return priceRepo.findById(id)
        .orElseThrow(()-> new NoSuchElementException("Price not found with id: "+id.toString()));
    }

    @Override
    public void savePrice(Price price) {
        priceRepo.save(price);

    }

    @Override
    public void updatePrice(Integer id, Price price) { 
        if(!id.equals(getPriceById(id).getId())){
            priceRepo.save(price);
        }
        else throw new NoSuchElementException("Price not found with id: "+id.toString());
    }

    @Override
    public void deletePrice(Integer id) { 
        if(!id.equals(getPriceById(id).getId())){
            priceRepo.delete(getPriceById(id));
        }
        else throw new NoSuchElementException("Price not found with id: "+id.toString());
    }

    @Override
    public Price getDataByPrice(PriceDataRequest priceData) {
        return priceRepo.getDataByPrice(priceData)
        .stream().findFirst()
        .orElseThrow(NoSuchElementException::new);
    } 
    

}
