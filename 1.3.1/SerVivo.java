/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author pv-alumno
 */
public class SerVivo {

    private int edad = 0;
    private String nombre = "";

    public SerVivo() {
    }

    public SerVivo(int edad, String nombre) {
        this.setEdad(edad);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public final void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;

        }
    }

    public String getNombre() {
        return nombre;
    }

    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Hacer sonido genérico");
    }

    public final void respirar() {
        System.out.println("Respirando");
    }
    
    @Override
    public String toString() {
        return """
               /--------------/
               SerVivo
               Edad: """ + edad + "\nNombre: " + nombre + "\n/--------------/";
    }
}