package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/user-service")
    public String userServiceFallback() {
        return "{\"status\": \"User service is currently unavailable. Please try again later.\", \"code\": \"SERVICE_UNAVAILABLE\"}";
    }

    @GetMapping("/notification-service")
    public String notificationServiceFallback() {
        return "{\"status\": \"Notification service is currently unavailable. Please try again later.\", \"code\": \"SERVICE_UNAVAILABLE\"}";
    }
}
