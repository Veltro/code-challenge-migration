package com.example.dummyjson.dto;

import java.util.List;

/**
 * DTO que representa a resposta da API com lista de produtos
 */
public class ProductResponse {
    /**
     * Lista de produtos retornada pela API
     */
    private List<Product> products;
    private int total;
    private int skip;
    private int limit;

    // Getters e Setters
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
} 