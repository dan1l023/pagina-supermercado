package com.example.paginasupermercado.web.controller;

import com.example.paginasupermercado.domain.product;
import com.example.paginasupermercado.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/products")
public class ProducController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<product>getAll()
    {
    return productService.getAll();
    }
    @GetMapping("/{Id}")
    public Optional<product> getproduct(@PathVariable("Id") int productId){

        return productService.getproduct(productId);
    }

    public Optional<List<product>> getByCategory (int categoryId){

        return productService.getByCategory(categoryId);
    }

    public product save(product Product){
        return productService.save(Product);
    }

    public boolean delete(int productId){
        return productService.delete(productId);
    }

}
