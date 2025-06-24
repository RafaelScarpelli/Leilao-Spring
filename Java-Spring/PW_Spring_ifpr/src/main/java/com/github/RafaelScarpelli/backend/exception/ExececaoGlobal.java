package com.github.RafaelScarpelli.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.github.RafaelScarpelli.backend.dto.RespostaErro;

@RestControllerAdvice
public class ExececaoGlobal {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<RespostaErro> notFound(NotFoundException ex, WebRequest request) {

        RespostaErro respostaErro = new RespostaErro(HttpStatus.NOT_FOUND.value(), "Não encontrado", ex.getMessage(),
                request.getDescription(false), null);
        return new ResponseEntity<>(respostaErro, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<RespostaErro> global(Exception ex, WebRequest request) {

        RespostaErro respostaErro = new RespostaErro(HttpStatus.BAD_REQUEST.value(), "Erro Interno", ex.getMessage(),
                request.getDescription(false), null);
        return new ResponseEntity<>(respostaErro, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
