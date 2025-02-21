package com.example.dummyjson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Configuração do WebClient para chamadas HTTP
 */
@Configuration
public class WebClientConfig {

    /**
     * Configura e fornece uma instância de WebClient.Builder para fazer chamadas HTTP.
     * @return WebClient.Builder Builder configurado
     */
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.build();
    }
}
