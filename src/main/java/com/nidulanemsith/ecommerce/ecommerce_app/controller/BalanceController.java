package com.nidulanemsith.ecommerce.ecommerce_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Ecommerce Application";
    }
}
