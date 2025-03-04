package com.task.CircuitBreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.CircuitBreaker.Service.ExternalService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class TestController {
	 @Autowired
	    private ExternalService externalService;

	    private static final String CIRCUIT_BREAKER_NAME = "externalServiceCB";

	    @GetMapping("/getData")
	    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackMethod")
	    public String getData() {
	        return externalService.fetchdata();
	    }

	    // Fallback method when circuit is open
	    public String fallbackMethod(Exception e) {
	        return "Fallback Response: External service is unavailable. Please try again later.";
	    }
}
