package br.edu.fatec.demo.controllers;

import br.edu.fatec.demo.models.Carros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class CarroApiController {
    private static List<Carros> carros = new ArrayList<Carros>();

    public CarroApiController() {
        carros.add(new Carros("  Hyundai ","  HB20   ", 60500));
        carros.add(new Carros("  Hyundai ","  Creta  ", 120000));
        carros.add(new Carros("  Volks   ","  Fusca  ", 60000));
        carros.add(new Carros("  Caoa    ","  Tiggo-8", 125000));

    }

    @GetMapping
    public List<Carros> getCarros() {
        return carros;
    }

}
