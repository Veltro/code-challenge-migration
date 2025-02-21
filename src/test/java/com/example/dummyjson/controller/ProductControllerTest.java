package com.example.dummyjson.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Teste de integração do controlador de produtos
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ProductControllerTest {

    /**
     * WebTestClient para teste
     */
    @Autowired
    private WebTestClient webTestClient;

    /**
     * Testa a obtenção de todos os produtos
     */
    @Test
    void testGetAllProducts() {
        webTestClient
            .get()
            .uri("/api/products")
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$").isArray()
            .jsonPath("$[0].id").isNotEmpty()
            .jsonPath("$[0].title").isNotEmpty();
    }

    /**
     * Testa a obtenção de um produto específico pelo ID
     */
    @Test
    void testGetProductById() {
        webTestClient
            .get()
            .uri("/api/products/1")
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$.id").isNotEmpty()
            .jsonPath("$.title").isNotEmpty();
    }
}
