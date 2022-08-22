package com.practical.test.controller;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practical.test.price.domain.PriceDataRequest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("Test for data Request Information")
@SpringBootTest
@AutoConfigureMockMvc
public class PriceRequestControllerTest {

    @Autowired
    private MockMvc mock;
    private ObjectMapper mapper = new ObjectMapper();
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
   
    @DisplayName("Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ADIDAS)")
    @Test
    void queryDataRequestPricesTest1() throws Exception {
        PriceDataRequest data = PriceDataRequest.builder()
        .brandId(1)
        .productId(35455)
        .applicationDate(formatter.parse("2020-06-14-10.00.00"))
        .build();
        mock.perform(post("/api/v1/priceData")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(data)))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.price").value(35.5f));
    }

    @DisplayName("Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ADIDAS)")
    @Test
    void queryDataRequestPricesTest2() throws Exception {
        PriceDataRequest data = PriceDataRequest.builder()
        .brandId(1)
        .productId(35455)
        .applicationDate(formatter.parse("2020-06-14-16.00.00"))
        .build();
        mock.perform(post("/api/v1/priceData")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(data)))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.price").value(25.45f));
    }

    @DisplayName("petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ADIDAS)")
    @Test
    void queryDataRequestPricesTest3() throws Exception {
        PriceDataRequest data = PriceDataRequest.builder()
        .brandId(1)
        .productId(35455)
        .applicationDate(formatter.parse("2020-06-14-21.00.00"))
        .build();
        mock.perform(post("/api/v1/priceData")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(data)))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.price").value(35.5f));
    }

    @DisplayName("petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ADIDAS)")
    @Test
    void queryDataRequestPricesTest4() throws Exception {
        PriceDataRequest data = PriceDataRequest.builder()
        .brandId(1)
        .productId(35455)
        .applicationDate(formatter.parse("2020-06-15-10.00.00"))
        .build();
        mock.perform(post("/api/v1/priceData")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(data)))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.price").value(30.5f));
    }

    @DisplayName("petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ADIDAS)")
    @Test
    void queryDataRequestPricesTest5() throws Exception {
        PriceDataRequest data = PriceDataRequest.builder()
        .brandId(1)
        .productId(35455)
        .applicationDate(formatter.parse("2020-06-16-21.00.00"))
        .build();
        mock.perform(post("/api/v1/priceData")
        .contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(data)))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.price").value(38.95f));
    }
}
