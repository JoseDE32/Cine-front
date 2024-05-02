package com.backcode.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.backcode.model.Salas;

public interface ISalas extends CrudRepository<Salas, Integer> {
    // Métodos de consulta personalizados si es necesario
}
