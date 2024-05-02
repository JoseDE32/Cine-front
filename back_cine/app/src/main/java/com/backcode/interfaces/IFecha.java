package com.backcode.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.backcode.model.Fecha;

public interface IFecha extends CrudRepository<Fecha, Integer> {
    // Métodos de consulta personalizados si es necesario
}
