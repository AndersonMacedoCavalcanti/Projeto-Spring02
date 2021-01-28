package com.example.projetospringjava.repositories;

import com.example.projetospringjava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
