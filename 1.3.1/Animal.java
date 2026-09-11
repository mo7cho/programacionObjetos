/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author pv-alumno
 */
public class Animal extends SerVivo{
    public Animal(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Rugido animal!!!");
    }
    
    
    
}
