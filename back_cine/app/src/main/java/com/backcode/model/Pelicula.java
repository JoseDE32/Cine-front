package com.backcode.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String director;
    private int duracion;
    private LocalDate fechaEstreno;

    // Constructor vacío
    public Pelicula() {
    }

    // Constructor con parámetros
    public Pelicula(String titulo, String director, int duracion, LocalDate fechaEstreno) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.fechaEstreno = fechaEstreno;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
