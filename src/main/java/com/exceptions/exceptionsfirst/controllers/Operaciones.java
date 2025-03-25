package com.exceptions.exceptionsfirst.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String Divide(@RequestParam (name="numerador")String numeradorStr,
                         @RequestParam (name="denominador")String denominadorStr) {
        // int valor = 20/0;
        // return "El resultado de la division es: " + valor;
        try {
            int numerador = Integer.parseInt(numeradorStr);
            int denominador = Integer.parseInt(denominadorStr);
            int resultado = numerador / denominador;
            return "El resultado de la division es: " + resultado;
        } catch (ArithmeticException e) {
            throw e;
        }catch (NumberFormatException e) {
            throw e;
        }
    }
    
}
