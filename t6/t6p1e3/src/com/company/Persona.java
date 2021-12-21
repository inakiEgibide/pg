package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
//atributos
    String nombre;
    LocalDate fechaNaciemiento;
    String direccion;
    String codigoPostal;
    String Ciudad;

//metodos
    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(LocalDate fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    //constructor
    public Persona(String nombre, LocalDate fechaNaciemiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.fechaNaciemiento = fechaNaciemiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        Ciudad = ciudad;
    }


}


