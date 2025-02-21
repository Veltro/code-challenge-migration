package com.example.dummyjson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dummyjson.dto.HealthResponse;

/**
 * Controller responsável por expor endpoints REST para operações com saúde da aplicação
 */
@RestController
@RequestMapping("/health")
public class HealthController {

	/**
     * Retorna o tatus atual de saúde do app
     * @return ResponseEntity<HealthResponse> Status de saúde do app
     */
    @GetMapping
    public ResponseEntity<HealthResponse> healthCheck() {
        HealthResponse health = new HealthResponse("UP", "Service is running");
        return ResponseEntity.ok(health);
    }
}