package com.example.projetospringjava.resources;


import com.example.projetospringjava.entities.Category;
import com.example.projetospringjava.entities.User;
import com.example.projetospringjava.service.CategoryService;
import com.example.projetospringjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
    List<Category> categoryList = categoryService.findAll();
    return ResponseEntity.ok().body(categoryList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable long id){
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
