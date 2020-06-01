package com.shelach.orders;

import com.shelach.orders.comax.converters.GetAllItemsPricesMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
@SpringBootApplication
public class OrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new LinkedList<>();
        messageConverters.add(new GetAllItemsPricesMessageConverter());
        messageConverters.addAll(restTemplate.getMessageConverters());
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }


}
