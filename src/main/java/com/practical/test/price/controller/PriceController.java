package com.practical.test.price.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;
 
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

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDto;
import com.practical.test.price.mapper.MapperPrice;
import com.practical.test.price.service.PriceService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/price")
@Slf4j
public class PriceController {
 
    private PriceService priceService;
    private MapperPrice mapperPrice;

    public PriceController(PriceService priceService, MapperPrice mapperPrice) {
        this.priceService = priceService;
        this.mapperPrice = mapperPrice;
    }

    @GetMapping()
    @ResponseBody
    public List<PriceDto> getPrice() {
        log.info("PriceDto EndPoint");
        return priceService.getPriceListed()
                .stream()
                .map(mapperPrice::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public PriceDto getGetPriceById(@PathVariable Integer id) {
        log.info("Price search by ID EndPoint");
        Price price = priceService.getPriceById(id);
        return mapperPrice.toDto(price);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void savePrice(@Valid @RequestBody Price price){
        log.info("Save Price");
        priceService.savePrice(price);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePrice(@PathVariable Integer id, @RequestBody Price price){
        log.info("Update Price");
        priceService.updatePrice(id, price);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePrice(@PathVariable Integer id){
        log.info("Delete Price information ", id);
        priceService.deletePrice(id);
    }
}
