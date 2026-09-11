/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oyarce.coleccionjuegos;

/**
 *
 * @author pv-alumno
 */
public final class Juego {
    private String nombre = "";
    private int anio = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Juego(String nombre, int anio) {
        this.setNombre(nombre);
        this.setAnio(anio);
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", anio=" + anio + '}';
    }
    
}
