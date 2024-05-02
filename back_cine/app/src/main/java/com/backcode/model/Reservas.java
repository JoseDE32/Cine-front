package com.backcode.model;

import javax.persistence.*;

@Entity
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_horario_proyeccion")
    private HorarioProyeccion horarioProyeccion;

    private int cantidadReservas;

    // Constructor vacío
    public Reservas() {
    }

    // Constructor con parámetros
    public Reservas(Cliente cliente, HorarioProyeccion horarioProyeccion, int cantidadReservas) {
        this.cliente = cliente;
        this.horarioProyeccion = horarioProyeccion;
        this.cantidadReservas = cantidadReservas;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public HorarioProyeccion getHorarioProyeccion() {
        return horarioProyeccion;
    }

    public void setHorarioProyeccion(HorarioProyeccion horarioProyeccion) {
        this.horarioProyeccion = horarioProyeccion;
    }

    public int getCantidadReservas() {
        return cantidadReservas;
    }

    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }
}
