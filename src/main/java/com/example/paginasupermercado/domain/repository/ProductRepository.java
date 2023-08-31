package com.example.paginasupermercado.domain.repository;

import com.example.paginasupermercado.domain.product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository{

    List<product> getAll();
    Optional<List<product>> getByCategory (int categoryId);
    Optional<List<product>> getScarseProducts(int quantity);
    Optional<product> getProduct (int productId);
    product save(product Product);
    void delete (int productiId);
}
