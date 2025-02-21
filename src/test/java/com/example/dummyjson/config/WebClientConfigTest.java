package com.example.dummyjson.config;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Teste de configuração do WebClient
 */
@SpringBootTest
public class WebClientConfigTest {

    /**
     * WebClient.Builder para teste
     */
    @Autowired
    WebClient.Builder webClientBuilder;

    /**
     * Testa se o WebClient.Builder foi corretamente configurado
     */
    @Test
    public void testWebClientConfig() {
        // Verifica se o WebClient.Builder foi corretamente configurado
        assertNotNull(webClientBuilder);
    }
}
