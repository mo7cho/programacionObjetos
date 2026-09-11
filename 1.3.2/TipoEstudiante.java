/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sotooyarce.trabajo2;

/**
 *
 * @author pv-alumno
 */
public class TipoEstudiante extends TipoUsuario implements ICapacidadEstudiantes{
    private final int CANTIDAD_MAXIMA_INTENTOS = 3;
    private int intentos = 0;

    public TipoEstudiante(String nombre, String correo, String contrasenia, String intento, int edad) {
        super(nombre, correo, contrasenia, intento, edad);
    }
         //if
    //this.intentos = 0
            //else
    //this.intentos += 1
    @Override
    public void iniciarSesion(String correo, String contrasenia){
        // valida que sea el mismo correo, pero quitando los espacios y dejando todo en minusculas como lo hace el setter
        Boolean mismoCorreo = super.getCorreo().equals(correo.trim().toLowerCase());
        Boolean mismaContrasenia = super.getContrasenia().equals(contrasenia.trim());
        if (this.intentos <= this.CANTIDAD_MAXIMA_INTENTOS && mismoCorreo && mismaContrasenia){
            Trabajo2.print("Inicio exitoso, buen dia Estudiante: " + super.getNombre());
        } else{
            this.intentos += 1;
            String mensaje = "Cuenta bloqueada, supero la cantidad maxima de intentos: " + this.intentos + "de " this.CANTIDAD_MAXIMA_INTENTOS;
            Trabajo2.print(mensaje);
    
            @Override
            public Double realizarPrueba(int puntaje){
                Double puntajeEnDecimal = (double)puntaje;
                Double nota = (puntajeEnDecimal * 7)/100;
                return nota
            }
        }
