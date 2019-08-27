package com.shelach.orders.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@SuppressWarnings("WeakerAccess")
@Service
public class ComaxCredentialsProvider {
    private final String username;
    private final String loginPassword;

    public ComaxCredentialsProvider(@Value("${comax.username}") String username, @Value("${comax.password}") String loginPassword) {
        this.username = username;
        this.loginPassword = loginPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getLoginPassword() {
        return loginPassword;
    }
}
