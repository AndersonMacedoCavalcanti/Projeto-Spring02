package com.example.projetospringjava.repositories;

import com.example.projetospringjava.entities.Category;
import com.example.projetospringjava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
