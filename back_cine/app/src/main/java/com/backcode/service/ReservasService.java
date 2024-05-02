package com.backcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backcode.interfaceservice.SReservas;
import com.backcode.model.Reservas;
import com.backcode.interfaces.IReservas;

@Service
public class ReservasService implements SReservas {

    @Autowired
    private IReservas reservasRepository;

    @Override
    public void crearReserva(Reservas reserva) {
        reservasRepository.save(reserva);
    }

    @Override
    public void borrarReserva(int id) {
        reservasRepository.deleteById(id);
    }
}
