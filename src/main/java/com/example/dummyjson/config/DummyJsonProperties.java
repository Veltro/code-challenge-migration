package com.example.dummyjson.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Configuração das propriedades da API DummyJSON
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "dummyjson.api")
public class DummyJsonProperties {
    private String baseUrl;

    /**
     * Obtém a URL base da API DummyJSON
     * @return URL base da API DummyJSON
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Define a URL base da API DummyJSON
     * @param baseUrl URL base da API DummyJSON
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}