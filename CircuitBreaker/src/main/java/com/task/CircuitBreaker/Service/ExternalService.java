package com.task.CircuitBreaker.Service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ExternalService {
	public String fetchdata() {
		if (new Random().nextBoolean()) {
            throw new RuntimeException("Service is down!");
        }
        return "Data from external service";
    }
}

