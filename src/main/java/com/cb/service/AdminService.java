package com.cb.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void onlyAdmin() {
        System.out.println("I`m admin!");
    }
}