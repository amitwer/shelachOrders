package com.shelach.orders.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class OrdersControllerClientSideTest {
    @Autowired
    private MockMvc mvc;

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


}