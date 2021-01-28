package com.example.projetospringjava.service;

import com.example.projetospringjava.entities.Category;
import com.example.projetospringjava.entities.Product;
import com.example.projetospringjava.repositories.CategoryRepository;
import com.example.projetospringjava.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return  productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

}
