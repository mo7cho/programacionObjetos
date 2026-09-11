/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sotooyarce.trabajo2;

/**
 *
 * @author pv-alumno
 */
public class Aula {

    private TipoProfesor profesor;
    private TipoEstudiante estudiante;
    private String codigo;

    public TipoProfesor getProfesor() {
        return profesor;
    }

    public void setProfesor(TipoProfesor profesor) {
        this.profesor = profesor;
    }

    public TipoEstudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(TipoEstudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Aula(TipoProfesor profesor, TipoEstudiante estudiante, String codigo) {
        this.profesor = profesor;
        this.estudiante = estudiante;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Aula con codigo" + this.getCodigo() + "profesor: " + this.profesor + "esstudainte: " + this.estudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
