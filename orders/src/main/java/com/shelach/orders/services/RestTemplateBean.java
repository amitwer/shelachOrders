package com.shelach.orders.services;

import com.shelach.orders.comax.converters.GetAllItemsPricesMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

@Configuration
public class RestTemplateBean {

    @Bean
    public RestTemplate restTemplate() throws UnknownHostException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 8888));
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setProxy(proxy);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        List<HttpMessageConverter<?>> messageConverters = new LinkedList<>();
        messageConverters.add(new GetAllItemsPricesMessageConverter());
        messageConverters.addAll(restTemplate.getMessageConverters());
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }
}
