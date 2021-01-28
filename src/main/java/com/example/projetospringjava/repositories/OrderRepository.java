package com.example.projetospringjava.repositories;

import com.example.projetospringjava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
