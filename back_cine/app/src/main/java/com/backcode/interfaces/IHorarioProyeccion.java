package com.backcode.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.backcode.model.HorarioProyeccion;

public interface IHorarioProyeccion extends CrudRepository<HorarioProyeccion, Integer> {
    // Métodos de consulta personalizados si es necesario
}
