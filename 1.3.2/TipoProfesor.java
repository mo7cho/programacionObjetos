/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sotooyarce.trabajo2;

/**
 *
 * @author pv-alumno
 */
public class TipoProfesor extends TipoUsuario{
    private final int CANTIDAD_MAXIMA_INTENTOS = 1;
    private int intentos = 0;

    public TipoProfesor(String nombre, String correo, String contrasenia, int edad) {
        super(nombre, correo, contrasenia, edad);
    }
    @Override
    public void iniciarSesion(String correo, String contrasenia){
        // valida que sea el mismo correo, pero quitando los espacios y dejando todo en minusculas como lo hace el setter
        Boolean mismoCorreo = super.getCorreo().equals(correo.trim().toLowerCase());
        Boolean mismaContrasenia = super.getContrasenia().equals(contrasenia.trim());
        if (this.intentos <= this.CANTIDAD_MAXIMA_INTENTOS && mismoCorreo && mismaContrasenia){
            Trabajo2.print("Inicio exitoso, buen dia profesor: " + super.getNombre());
        } else{
            this.intentos += 1;
            String mensaje = "Cuenta bloqueada, supero la cantidad maxima de intentos: " + this.intentos + "de " this.CANTIDAD_MAXIMA_INTENTOS;
            Trabajo2.print(mensaje);
        }
    }
}
