package com.shelach.orders.services;

import com.shelach.orders.comax.generated.itemdetails.ArrayOfItemDetails;
import com.shelach.orders.comax.generated.itemdetails.ItemDetails;
import com.shelach.orders.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ItemDetailsService {
    private final RestTemplate restTemplate;
    private final ComaxCredentialsProvider credentialsProvider;
    private final String itemsUrl;

    @Autowired
    public ItemDetailsService(RestTemplate restTemplate, ComaxCredentialsProvider credentialsProvider, @Value("${comax.api.items-url}") String itemsUrl) {
        this.restTemplate = restTemplate;
        this.credentialsProvider = credentialsProvider;
        this.itemsUrl = itemsUrl + "/Get_AllItemsDetailsBySearch_plus";
    }

    public List<Order> getAllItemsDetails() {
        log.info("Getting all itemDetails");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(paramsForRequest(), headers);
        ArrayOfItemDetails response = restTemplate.postForObject(itemsUrl, request, ArrayOfItemDetails.class);
        return convertItemDetailsToOrders(response);

    }

    private List<Order> convertItemDetailsToOrders(ArrayOfItemDetails response) {
        return response.getClsItems().stream().map(this::itemDetailsToOrder).collect(Collectors.toList());
    }

    private Order itemDetailsToOrder(ItemDetails itemDetails) {
        return new Order(itemDetails.getDepartment(), itemDetails.getName(), itemDetails.getBarcode(), 0, null);
    }

    private MultiValueMap<String, String> paramsForRequest() {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("LoginID", credentialsProvider.getUsername());
        params.add("LoginPassword", credentialsProvider.getLoginPassword());
        params.add("ItemID", "");
        params.add("DepartmentID", "");
        params.add("GroupID", "");
        params.add("Sub_GroupID", "");
        params.add("ItemModelID", "");
        params.add("ItemColorID", "");
        params.add("ItemSizeID", "");
        params.add("StoreID", "");
        params.add("PriceListID", "");
        params.add("StoreIDForOpenOrdersOffset", "");
        params.add("SupplierID", "");
        params.add("CustomerID", "");
        params.add("NotIncludeSuppliersOrdersInQuantity", "");
        params.add("LastUpdatedFromDate", "");
        return params;
    }
}
