package com.shelach.orders.services;

import com.shelach.orders.comax.generated.pricesresult.ClsItemPrices;
import com.shelach.orders.comax.generated.pricesresult.ClsItemsSalePrices;
import com.shelach.orders.comax.generated.pricesresult.GetAllItemsPricesByParamsResponse;
import com.shelach.orders.data.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
@Slf4j
public class FetchPricesService {
    private final RestTemplate template;
    private final ComaxCredentialsProvider comaxCredentialsProvider;
    private final String itemsSoapUrl;

    @Autowired
    public FetchPricesService(RestTemplate template, ComaxCredentialsProvider comaxCredentialsProvider, @Value("${comax.api.items-url}") String itemsSoapUrl) {

        this.template = template;
        this.comaxCredentialsProvider = comaxCredentialsProvider;
        this.itemsSoapUrl = itemsSoapUrl;
    }

    public Map<Integer, Set<Order>> getAllPrices() {
        log.info("Fetching all Prices");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "soap+xml", StandardCharsets.UTF_8));
        HttpEntity<String> request = new HttpEntity<>(createPricesRequest(), headers);
        ResponseEntity<GetAllItemsPricesByParamsResponse> responseEntity =
                template.postForEntity(itemsSoapUrl, request,
                        GetAllItemsPricesByParamsResponse.class);
        GetAllItemsPricesByParamsResponse allItemsByPrice = responseEntity.getBody();
        return extractPriceLists(allItemsByPrice);
    }

    private Map<Integer, Set<Order>> extractPriceLists(GetAllItemsPricesByParamsResponse allItemsByPrice) {
        Map<Integer, Set<Order>> ordersPerPriceList = new HashMap<>();
        if (Objects.nonNull(allItemsByPrice)) {
            allItemsByPrice.getGetAllItemsPricesByParamsResult().getClsItemsSalePrices()
                    .forEach(price -> addToMap(ordersPerPriceList, price));
        }
        return ordersPerPriceList;
    }

    private void addToMap(Map<Integer, Set<Order>> ordersPerPriceList, ClsItemsSalePrices salesPrice) {
        for (ClsItemPrices price : salesPrice.getSalesPrice().getClsItemPrices()) {
            if (price.getPrice() == 0) {
                continue;
            }
            Set<Order> relevantSet = ordersPerPriceList.getOrDefault(price.getPriceListID(), new HashSet<>());
            relevantSet.add(new Order(null, salesPrice.getName(), salesPrice.getBarcode(), 0, price.getPrice()));
            ordersPerPriceList.put(price.getPriceListID(), relevantSet);
        }
    }

    private String createPricesRequest() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "  <soap12:Body>\n" +
                "    <Get_AllItemsPricesByParams xmlns=\"http://ws.comax.co.il/Comax_WebServices/\">\n" +
                "      <Params>\n" +
                "            <PriceListID>13</PriceListID>\n" +
                "      </Params>\n" +
                "      <LoginID>" + this.comaxCredentialsProvider.getUsername() + "</LoginID>\n" +
                "      <LoginPassword>" + this.comaxCredentialsProvider.getLoginPassword() + "</LoginPassword>\n" +
                "    </Get_AllItemsPricesByParams>\n" +
                "  </soap12:Body>\n" +
                "</soap12:Envelope>";
    }
}
