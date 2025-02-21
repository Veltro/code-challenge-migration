package com.example.dummyjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicia a aplicação Spring Boot
 */
@SpringBootApplication
public class DummyJsonClientApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        SpringApplication.run(DummyJsonClientApplication.class, args);
    }
}
