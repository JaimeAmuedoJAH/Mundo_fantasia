package com.jah.mundo_fantasia;

import java.io.Serializable;

public class Tierra implements Serializable {

    private String nombre;
    private int imagen;
    private String juego;
    private String descrpcion;

    public Tierra(String nombre, int imagen, String juego, String descrpcion) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.juego = juego;
        this.descrpcion = descrpcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    @Override
    public String toString() {
        return "Tierra{" +
                "nombre='" + nombre + '\'' +
                ", imagen=" + imagen +
                ", juego='" + juego + '\'' +
                '}';
    }
}
