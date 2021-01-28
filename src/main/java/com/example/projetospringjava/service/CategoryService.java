package com.example.projetospringjava.service;

import com.example.projetospringjava.entities.Category;
import com.example.projetospringjava.entities.Order;
import com.example.projetospringjava.repositories.CategoryRepository;
import com.example.projetospringjava.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return  categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
