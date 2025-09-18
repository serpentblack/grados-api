package com.desaextremo.grados.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grados")
@CrossOrigin(origins = "*")
public class GradosController {

    @GetMapping("/ping")
        public String ping() {
        return "Mensaje de respuesta";
    }

    @GetMapping("/centtofahr/{grades}")
    public double centigradosAFahrenheit(@PathVariable("grades") double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }
}
