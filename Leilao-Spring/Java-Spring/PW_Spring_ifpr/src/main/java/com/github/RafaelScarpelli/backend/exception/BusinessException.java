package com.github.RafaelScarpelli.backend.exception;

public class BusinessException extends RuntimeException{

    public BusinessException(String mensagem){
        super(mensagem);
    }
    
}
