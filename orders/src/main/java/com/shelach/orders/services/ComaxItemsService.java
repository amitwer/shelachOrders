package com.shelach.orders.services;

import com.shelach.orders.comax.generated.items.ArrayOfClsItemsType;
import com.shelach.orders.comax.generated.items.ClsItemsType;
import com.shelach.orders.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SuppressWarnings("WeakerAccess")
@Service
@Slf4j
public class ComaxItemsService {

    private final RestTemplate restTemplate;
    private final ComaxCredentialsProvider comaxCredentialsProvider;
    private final String itemsServiceUrl;
    private List<ClsItemsType> itemList;


    public ComaxItemsService(RestTemplate restTemplate, ComaxCredentialsProvider comaxCredentialsProvider, @Value("${comax.api.items-url}") String itemsServiceUrl) {
        this.restTemplate = restTemplate;
        this.comaxCredentialsProvider = comaxCredentialsProvider;
        this.itemsServiceUrl = itemsServiceUrl;
        itemList = null;
    }

    public List<Order> getAllProducts() {
        if (CollectionUtils.isEmpty(itemList)) {
            ResponseEntity<ArrayOfClsItemsType> response = getProductsFromComax();
            ArrayOfClsItemsType items = response.getBody();
            itemList = Optional.ofNullable(items).map(ArrayOfClsItemsType::getClsItems).orElse(new LinkedList<>());
        }
        return itemList.stream().map(item -> new Order(item.getDepartment(), item.getName(), "" + item.getBarcode(), 0, item.getSupplierPrice().doubleValue())).collect(Collectors.toList());
    }

    private ResponseEntity<ArrayOfClsItemsType> getProductsFromComax() {
        log.info("Fetching all products from comax");
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(itemsServiceUrl + "GetAllItemsDetails")
                .queryParam("LoginID", comaxCredentialsProvider.getUsername())
                .queryParam("LoginPassword", comaxCredentialsProvider.getLoginPassword())
                .queryParam("StoreID", "1");
        ResponseEntity<ArrayOfClsItemsType> response = restTemplate.getForEntity(builder.toUriString(), ArrayOfClsItemsType.class);
        log.info("Got response from Comax");
        return response;
    }
}
