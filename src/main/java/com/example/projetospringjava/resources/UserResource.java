package com.example.projetospringjava.resources;


import com.example.projetospringjava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

@GetMapping
public ResponseEntity<User> findAll(){
        User user = new User(7L,"ander","ander.com","88888888","12345");
        return ResponseEntity.ok().body(user);
    }
}
