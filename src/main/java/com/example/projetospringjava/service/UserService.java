package com.example.projetospringjava.service;

import com.example.projetospringjava.entities.User;
import com.example.projetospringjava.repositories.UserRepository;
import com.example.projetospringjava.service.exception.DatabaseException;
import com.example.projetospringjava.service.exception.ResouceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()-> new ResouceNotFoundException(id));
    }

    public User insert(User user){
            return userRepository.save(user);
    }
    
    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResouceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id,User obj){
        try {
            //getOne prepara o objeto para utilizar
            User entity = userRepository.getOne(id);
            updateData(entity,obj);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResouceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }

}
