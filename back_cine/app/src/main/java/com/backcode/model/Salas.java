package com.backcode.model;

import javax.persistence.*;

@Entity
public class Salas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroSala;
    private String tipoSala;
    private int capacidad;

    // Constructor vacío
    public Salas() {
    }

    // Constructor con parámetros
    public Salas(int numeroSala, String tipoSala, int capacidad) {
        this.numeroSala = numeroSala;
        this.tipoSala = tipoSala;
        this.capacidad = capacidad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
