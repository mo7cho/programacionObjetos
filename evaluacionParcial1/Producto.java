/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oyarce.mavenproject1;

/**
 *
 * @author pv-alumno
 */
public abstract class Producto {
    private String nombre = "";
    private int garantiaMeses = 0;
    private String categoria = "";
    private int anioFabricacion;
    private boolean esElectrico = false;
    private double calificacionCliente = 0.0;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        if (garantiaMeses < 0) {
            System.out.println("La garantía debe ser mayor a 0 meses.");
        }
        this.garantiaMeses = garantiaMeses;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 0) {
            System.out.println("El año de fabricacion debe ser mayor a 0 meses.");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public double getCalificacionCliente() {
        return calificacionCliente;
    }

    public void setCalificacionCliente(double calificacionCliente) {
        if (calificacionCliente > 0.0 && calificacionCliente <= 10.0) {
            System.out.println("La calificación debe estar entre 0 a 10.");
        }
        this.calificacionCliente = calificacionCliente;
    }
    
    public abstract double calcularPrecioVentaFinal();
    
}
