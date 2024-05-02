package com.backcode.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backcode.model.Pelicula;

@Repository
public interface IPelicula extends CrudRepository<Pelicula, Integer> {

}
