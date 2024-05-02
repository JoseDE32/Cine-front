package com.backcode.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.backcode.model.Reservas;

public interface IReservas extends CrudRepository<Reservas, Integer> {
    // Métodos de consulta personalizados si es necesario
}
