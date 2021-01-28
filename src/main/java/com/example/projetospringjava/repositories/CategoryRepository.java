package com.example.projetospringjava.repositories;

import com.example.projetospringjava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
