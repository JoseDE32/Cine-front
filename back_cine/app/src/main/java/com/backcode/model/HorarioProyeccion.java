package com.backcode.model;

import javax.persistence.*;

@Entity
public class HorarioProyeccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Salas sala;

    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "id_fecha")
    private Fecha fecha;

    private String horaInicio;
    private String jornada; // Nuevo atributo

    // Constructor vacío
    public HorarioProyeccion() {
    }

    // Constructor con parámetros
    public HorarioProyeccion(Salas sala, Pelicula pelicula, Fecha fecha, String horaInicio, String jornada) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.jornada = jornada;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}
