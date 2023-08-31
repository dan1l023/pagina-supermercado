package com.example.paginasupermercado.domain.service;


import com.example.paginasupermercado.domain.product;
import com.example.paginasupermercado.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<product> getAll (){

        return productRepository.getAll();
    }

    public Optional<product>getproduct(int productId){

        return productRepository.getProduct(productId);
    }

    public Optional<List<product>> getByCategory (int categoryId){
        return productRepository.getByCategory(categoryId);
    }
    public product save (product Product){

      return  productRepository.save(Product);
    }
   public boolean delete (int productId){

        return getproduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
   }

}
