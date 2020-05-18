package com.shelach.orders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchPricesService {
    private RestTemplate template;

    @Autowired
    public FetchPricesService(RestTemplate template) {

        this.template = template;
    }
}
