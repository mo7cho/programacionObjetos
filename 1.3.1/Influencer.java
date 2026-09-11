/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author pv-alumno
 */
public class Influencer extends Persona {
    
    int cantidadSeguidores = 0;

    public int getCantidadSeguidores() {
        return cantidadSeguidores;
    }

    public void setCantidadSeguidores(int cantidadSeguidores) {
        this.cantidadSeguidores = cantidadSeguidores;
    }
    
    public Influencer(int edad, String nombre, int cantidadSeguidores) {
        super(edad, nombre);
        this.setCantidadSeguidores(cantidadSeguidores);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy famoso.");
    }

    @Override
    public String toString() {
        return "Influencer:" + "\nCantidad de seguidores:" + cantidadSeguidores + "\nNombre:" + super.getNombre() + "\nEdad:" + super.getEdad();
    }
    
    
    
}
