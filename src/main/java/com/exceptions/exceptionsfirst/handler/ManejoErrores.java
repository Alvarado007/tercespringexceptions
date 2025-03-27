package com.exceptions.exceptionsfirst.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException e) {
        return new ResponseEntity<>("Error: Division por cero no permitida ",
            HttpStatus.BAD_REQUEST); 
    }
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException e) {
        return new ResponseEntity<>("Error: Formato de numero incorrecto",
            HttpStatus.BAD_REQUEST); 
    }
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException e) {
        return new ResponseEntity<>("Error: Valor nulo",
            HttpStatus.INTERNAL_SERVER_ERROR); 
    }

}
