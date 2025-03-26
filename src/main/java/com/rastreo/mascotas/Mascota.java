package com.rastreo.mascotas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascotas") // Asegura el mapeo a la tabla 'mascotas'
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    private Long id;

    @Column(nullable = false, length = 100) // El nombre es obligatorio y tiene un límite de 100 caracteres
    private String nombre;

    @Column(length = 50) // Raza con una longitud máxima de 50 caracteres
    private String raza;

    @Column(nullable = true) // Edad opcional
    private Integer edad;

    // Constructor vacío requerido por JPA
    public Mascota() {}

    // Constructor completo para facilitar la inicialización
    public Mascota(String nombre, String raza, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}