package com.example.usuarios;

import org.springframework.http.ResponseEntity;
import com.example.usuarios.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> tratarErro(RuntimeException ex) {

        ErrorResponse erro = new ErrorResponse(
                400,
                ex.getMessage(),
                LocalDateTime.now()
        );

        return ResponseEntity.badRequest().body(erro);
    }


}
