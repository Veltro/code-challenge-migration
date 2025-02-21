package com.example.dummyjson.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.dummyjson.dto.Product;

/**
 * Teste de integração do serviço de produtos
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ProductServiceTest {

    /**
     * Serviço de produtos para teste
     */
    @Autowired
    private ProductService productService;

    /**
     * Testa a obtenção de todos os produtos
     */
    @Test
    void testGetAllProducts() {
        List<Product> products = productService.getAllProducts();
        assertNotNull(products);
        assertTrue(products.size() > 0);
    }

    /**
     * Testa a obtenção de um produto específico pelo ID
     */
    @Test
    void testGetProductById() {
        Product product = productService.getProductById(1L);
        assertNotNull(product);
        assertNotNull(product.getTitle());
    }
}


