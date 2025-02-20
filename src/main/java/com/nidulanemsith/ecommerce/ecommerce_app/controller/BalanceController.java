package com.nidulanemsith.ecommerce.ecommerce_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/myBalance")
    public String welcome() {
        return "Here are the balance details from the DB";
    }
}
