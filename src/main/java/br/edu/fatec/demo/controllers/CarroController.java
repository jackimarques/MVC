package br.edu.fatec.demo.controllers;

import br.edu.fatec.demo.models.Carros;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carros")
public class CarroController {

    private static List<Carros> carros = new ArrayList<Carros>();

    public CarroController() {
        carros.add(new Carros("  Hyundai ","  HB20   ", 60500));
        carros.add(new Carros("  Hyundai ","  Creta  ", 120000));
        carros.add(new Carros("  Volks   ","  Fusca  ", 60000));
        carros.add(new Carros("  Caoa    ","  Tiggo-8", 125000));

    }

    @GetMapping
    public String getCarros(Model model)
    {
        model.addAttribute("carros", carros);
        return "carros";


    }
}
