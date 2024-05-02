package com.backcode.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.backcode.model.Pelicula;
import com.backcode.model.Reservas;
import com.backcode.interfaces.IPelicula;

@Controller
@RequestMapping
public class contolador {

    @Autowired
    private IPelicula service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Pelicula>pelicula=service.listar();
        model.addAttribute("Pelicula", pelicula);
        return "index";
    }

    @PostMapping("/crearReserva")
    public String crearReserva(@ModelAttribute("reserva") Reservas reserva) {
        // Lógica para guardar la reserva en la base de datos
        // Puedes usar el servicio SReservas para manejar la lógica de creación de reservas
        return "redirect:/listar"; // Redirige a la página de listado después de crear la reserva
    }

    @GetMapping("/borrarReserva/{id}")
    public String borrarReserva(@PathVariable("id") Long id) {
        // Lógica para borrar la reserva con el ID proporcionado
        // Puedes usar el servicio SReservas para manejar la lógica de borrado de reservas
        return "redirect:/listar"; // Redirige a la página de listado después de borrar la reserva
    }

    
}

