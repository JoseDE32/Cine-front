package com.backcode.service;

import com.backcode.model.Pelicula;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.backcode.interfaces.IPelicula;
import com.backcode.interfaceservice.SPelicula;

public class PeliculaService  implements SPelicula{

    @Autowired
    private IPelicula data;

    @Override
    public List<Pelicula> listar() {
        return (List<Pelicula>)data.findAll();
    }

    @Override
    public int save(Pelicula p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
