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
import com.backcode.interfaceservice.SPelicula;
import com.backcode.interfaceservice.SReservas;

@Controller
@RequestMapping
public class contolador {

    @Autowired
    private SPelicula service;

    @Autowired
    private SReservas reservasService;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Pelicula>pelicula=service.listar();
        model.addAttribute("Pelicula", pelicula);
        return "index";
    }

    @PostMapping("/crearReserva")
    public String crearReserva(@ModelAttribute("reserva") Reservas reserva) {
        reservasService.crearReserva(reserva);
        return "redirect:/listar";
    }

    @GetMapping("/borrarReserva/{id}")
    public String borrarReserva(@PathVariable("id") int id) {
        reservasService.borrarReserva(id);
        return "redirect:/listar";
    }   
}
