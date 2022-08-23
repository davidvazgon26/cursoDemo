package com.cursojava.cursoDemo.controllers;

//para manejar las url a nuestro sitio web

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value="prueba")
    public String prueba(){
        return "Prueba controller";
    }
}
