package com.example.projetospringjava.service.exception;

public class ResouceNotFoundException extends RuntimeException{

    public  ResouceNotFoundException(Object id){
        super("Resouce Not Found/ id " + id);
    }

}
