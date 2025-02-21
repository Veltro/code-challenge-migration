package com.example.dummyjson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.dto.ProductResponse;

/**
 * Service responsável pela lógica de negócio relacionada a produtos
 */
@Service
public class ProductService {

    @Value("${dummyjson.api.base-url}")
    private String baseUrl;

    @Autowired
    private WebClient.Builder webClientBuilder;

    /**
     * Busca todos os produtos da API externa
     * @return List<Product> Lista de produtos
     */
    public List<Product> getAllProducts() {
        WebClient webClient = webClientBuilder.baseUrl(baseUrl.trim()).build();
        return webClient.get()
                .retrieve()
                .bodyToMono(ProductResponse.class)
                .map(ProductResponse::getProducts)
                .block();
    }

    /**
     * Busca um produto específico pelo ID na API externa
     * @param id ID do produto
     * @return Product Dados do produto
     */
    public Product getProductById(Long id) {
        String url = baseUrl + "/" + id;
        WebClient webClient = webClientBuilder.baseUrl(url.trim()).build();
        return webClient.get()
                .retrieve()
                .bodyToMono(Product.class)
                .block();
    }
}
