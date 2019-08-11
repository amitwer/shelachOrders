package com.shelach.orders.controllers;

import com.shelach.orders.data.ProductDTO;
import com.shelach.orders.services.ProductsService;
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
    private ProductsService productsService;

    private static Stream<List<ProductDTO>> expectedProductsProvider() {
        return Stream.of(List.of(new ProductDTO("name", 1.0, "barcode", "category")),
                List.of(
                        new ProductDTO("name1", 1.0, "barcode1", "category1"),
                        new ProductDTO("name2", 2.0, "barcode2", "category2")
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
    void loginReturnsProductTable(List<ProductDTO> expectedProducts) throws Exception {
        List<ProductDTO> expectedList = List.of(new ProductDTO("name", 1.0, "barcode", "category"));
        when(productsService.getProducts(any())).thenReturn(expectedList);
        MvcResult mvcResult = mvc.perform(get("").with(csrf())).andReturn();
        verifyOrdersTable(expectedList, mvcResult);


    }

    private void verifyOrdersTable(List<ProductDTO> expectedList, MvcResult mvcResult) throws UnsupportedEncodingException {
        String rawHtml = mvcResult.getResponse().getContentAsString();
        Document parsedHtml = Jsoup.parse(rawHtml);
        Element ordersTable = parsedHtml.body().getElementById("orders_table");
        assertThat(ordersTable).isNotNull();
        verifyOrdersTableHeader(ordersTable);
        verifyOrdersTableBody(ordersTable, expectedList);
    }

    private void verifyOrdersTableBody(Element ordersTable, List<ProductDTO> expectedList) {
        Elements tbody = ordersTable.getElementsByTag("tbody");
        assertThat(tbody).isNotNull().hasSize(1);
        Elements rows = tbody.get(0).getElementsByTag("tr");
        assertThat(rows).hasSize(expectedList.size());
        for (int i = 0; i < expectedList.size(); i++) {
            List<String> tableRow = rows.get(i).getElementsByTag("td")
                    .stream().map(Element::text).collect(Collectors.toList());
            ProductDTO expected = expectedList.get(i);
            assertThat(tableRow).isEqualTo(List.of(expected.getName(), expected.getBarcode(), "" + expected.getPrice()));
        }
    }

    private void verifyOrdersTableHeader(Element ordersTable) {
        Elements thead = ordersTable.getElementsByTag("thead");
        assertThat(thead).isNotNull().hasSize(1);
        List<String> headerTexts = thead.get(0).getElementsByTag("th").stream().map(Element::text)
                .collect(Collectors.toList());
        assertThat(headerTexts).isEqualTo(List.of("מוצר", "ברקוד", "מחיר ליחידה"));

    }


}