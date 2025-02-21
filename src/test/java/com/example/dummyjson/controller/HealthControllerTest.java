package com.example.dummyjson.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Teste de saúde da aplicação
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class HealthControllerTest {

    /**
     * WebTestClient para teste
     */
    @Autowired
    private WebTestClient webTestClient;

    /**
     * Testa se a saúde da aplicação está ok
     */
    @Test
    void testHealthCheck() {
        webTestClient
            .get()
            .uri("/health")
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$.status").isEqualTo("UP")
            .jsonPath("$.message").isEqualTo("Service is running");
    }
} 