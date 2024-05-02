package com.backcode.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.backcode.model.Pelicula;

public interface IPelicula extends CrudRepository<Pelicula, Integer> {

    List<Pelicula> listar();
    // Métodos de consulta personalizados si es necesario
}
