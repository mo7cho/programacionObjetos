/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sotooyarce.trabajo2;

/**
 *
 * @author pv-alumno
 */
public abstract class TipoUsuario {

    //para correo el int final, hay que arreglarlo
    private int final EXTENSION_MINIMA = 8;
    private String nombre = "";
    private String correo = "";
    private String contrasenia = "";
    private String intento = "";
    private int edad = 0;

    public String getIntento() {
        return intento;
    }

    public void setIntento(String intento) {
        this.intento = intento;
    }
    

    public TipoUsuario(String nombre, String correo, String contrasenia, String intento, int edad) {
        //en el constructor se aprovechan las validaciones ya hechas
        this.setNombre(nombre);
        this.setCorreo(correo);
        this.setContrasenia(contrasenia);
        this.setIntento(intento);
        this.setEdad(edad);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().isEmpty()){
        this.nombre = nombre.trim().toLowerCase();
    }}

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.trim().isEmpty()){
        this.correo = correo.trim().toLowerCase();
    }}

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        if (contrasenia.trim().length() >= 8)
            this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18 && edad < 99){
            this.edad = edad;
        } else {
            Trabajo2.print("Edad debe ser mayor o igal a 18 y menor a 99");
        }
    }
    
    //metodo abstracto no necesita cuerpo, es como una idea de como va a ser el metodo o algo asi no me acuerdo
    public abstract void iniciarSesion(String correo, String contrasenia);

    @Override
    public String toString() {
        return "Aula con codigo: " +this.getCodigo()+ "correo=" + correo + ", contrasenia=" + contrasenia + '}';
    }
    
}
