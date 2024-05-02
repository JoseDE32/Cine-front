package com.backcode.service;

import com.backcode.model.Pelicula;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backcode.interfaces.IPelicula;
import com.backcode.interfaceservice.SPelicula;

@Service
public class PeliculaService  implements SPelicula{

    @Autowired
    private IPelicula data;

    @Override
    public List<Pelicula> listar() {
        return (List<Pelicula>)data.findAll();
    }

}
