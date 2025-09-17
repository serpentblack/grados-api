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

    @GetMapping("/centtofahr/{grades}")
    public double centigradosAFahrenheit(@PathVariable("grades") double c) {
        return (c * 9.0 / 5.0) + 32.0;
    }

    @GetMapping("/fahrtocent/{grades}")
    public double fahrenheitACentigrados(@PathVariable("grades") double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }

    @GetMapping("/centtokelv/{grades}")
    public double centigradosAKelvin(@PathVariable("grades") double c) {
        return c + 273.15;
    }

    @GetMapping("/kelvintocent/{grades}")
    public double kelvinACentigrados(@PathVariable("grades") double k) {
        return k - 273.15;
    }
}
