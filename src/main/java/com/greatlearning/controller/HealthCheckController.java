package com.greatlearning.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheckController {

	@GetMapping("/healthCheck")
    public ResponseEntity<String> getHealthCheck(){
        return ResponseEntity.ok().body("Application is up.");
    }
}

