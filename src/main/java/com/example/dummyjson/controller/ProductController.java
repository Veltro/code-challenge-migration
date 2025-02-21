package com.example.dummyjson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dummyjson.dto.Product;
import com.example.dummyjson.service.ProductService;

import jakarta.validation.constraints.NotNull;

/**
 * Controller responsável por expor endpoints REST para operações com produtos
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Retorna uma lista com todos os produtos disponíveis
     * @return List<Product> Lista de produtos
     */
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /**
     * Retorna um produto específico pelo seu ID
     * @param id ID do produto
     * @return Product Dados do produto
     */
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable @NotNull Long id) {
        return productService.getProductById(id);
    }
}
