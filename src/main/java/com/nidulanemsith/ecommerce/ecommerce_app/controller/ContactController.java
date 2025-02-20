package com.nidulanemsith.ecommerce.ecommerce_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/Contact")
    public String saveContactInquiryDetails() {
        return "Inquiry details are saved to the DB";
    }
}
