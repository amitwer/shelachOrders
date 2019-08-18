package com.shelach.orders.controllers;

import com.shelach.orders.data.Order;
import com.shelach.orders.services.FetchOrdersService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.list;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SuppressWarnings("unused")
@ExtendWith({SpringExtension.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class OrdersControllerClientSideTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private FetchOrdersService fetchOrdersService;

    private static Stream<List<Order>> expectedProductsProvider() {
        return Stream.of(list(new Order("category", "name", "barcode", 6, 12.2)),
                list(
                        new Order("category1", "name1", "barcode1", 1, 1.1),
                        new Order("category2", "name2", "barcode2", 2, 2.2)
                ));
    }

    @SuppressWarnings("unused")

    @Test
    @WithMockUser(username = "Amit", password = "Amit")
    void ordersPageShowsUserNameInWelcomeMessage() throws Exception {
        MvcResult mvcResult = mvc.perform(get("").with(csrf())).andReturn();
        assertThat(mvcResult.getResponse().getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(mvcResult.getResponse().getContentAsString()).contains("<H1><span>Welcome Amit to the ordering page</span></H1>");
    }

    @Test
    void loginPageDeclinesUserWithIncorrectCredentials() throws Exception {
        MvcResult mvcResult = mvc.perform(get("")
                .with(csrf())
                .with(httpBasic("a", "bc"))
        ).andReturn();
        assertThat(mvcResult.getResponse().getStatus()).isEqualTo(HttpStatus.UNAUTHORIZED.value());
    }

    @ParameterizedTest
    @MethodSource("expectedProductsProvider")
    @WithMockUser(username = "Amit", password = "Amit")
    void loginReturnsProductTable(List<Order> expectedProducts) throws Exception {
        when(fetchOrdersService.getProducts(any())).thenReturn(expectedProducts);
        MvcResult mvcResult = mvc.perform(get("").with(csrf())).andReturn();
        verifyOrdersTable(expectedProducts, mvcResult);


    }

    private void verifyOrdersTable(List<Order> expectedList, MvcResult mvcResult) throws UnsupportedEncodingException {
        String rawHtml = mvcResult.getResponse().getContentAsString();
        Document parsedHtml = Jsoup.parse(rawHtml);
        Element ordersTable = parsedHtml.body().getElementById("orders_table");
        assertThat(ordersTable).isNotNull();
        verifyOrdersTableHeader(ordersTable);
        verifyOrdersTableBody(ordersTable, expectedList);
    }

    private void verifyOrdersTableBody(Element ordersTable, List<Order> expectedList) {
        Elements tbody = ordersTable.getElementsByTag("tbody");
        assertThat(tbody).isNotNull().hasSize(1);
        Elements rows = tbody.get(0).getElementsByTag("tr");
        assertThat(rows).hasSize(expectedList.size());
        for (int i = 0; i < expectedList.size(); i++) {
            List<String> tableRow = rows.get(i).getElementsByTag("td")
                    .stream().map(this::extractTextFromElement).collect(Collectors.toList());
            Order expected = expectedList.get(i);
            assertThat(tableRow).isEqualTo(list(expected.getName(), expected.getBarcode(), "" +
                    expected.getPrice(), "" + expected.getQuantity()));
        }
    }

    private String extractTextFromElement(Element element) {
        Elements inputTags = element.getElementsByTag("input");
        if (inputTags.size() == 1) {
            return inputTags.get(0).val();
        }
        return element.text();
    }

    private void verifyOrdersTableHeader(Element ordersTable) {
        Elements thead = ordersTable.getElementsByTag("thead");
        assertThat(thead).isNotNull().hasSize(1);
        List<String> headerTexts = thead.get(0).getElementsByTag("th").stream().map(Element::text)
                .collect(Collectors.toList());
        assertThat(headerTexts).isEqualTo(list("מוצר", "ברקוד", "מחיר ליחידה", "כמות"));

    }


}