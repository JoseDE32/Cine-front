package com.backcode.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.backcode.model.Cliente;

public interface ICliente extends CrudRepository<Cliente, Integer> {
    // Métodos de consulta personalizados si es necesario
}
