package com.practical.test.price.service;

import com.practical.test.price.domain.Price;
import com.practical.test.price.domain.PriceDataRequest;

public interface PriceDataRequestService {
    Price requestPriceData(PriceDataRequest data);
}
