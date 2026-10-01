/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oyarce.mavenproject1;

/**
 *
 * @author pv-alumno
 */
public class HerramientaProfesional extends Producto implements ISoporteTecnico {

    public HerramientaProfesional(String nombre, int garantiaMeses, String categoria, int anioFabricacion, boolean esElectrico, double calificacionCliente, String nivelCertificacion) {
        setNombre(nombre);
        setGarantiaMeses(garantiaMeses);
        setCategoria(categoria);
        setAnioFabricacion(anioFabricacion);
        setEsElectrico(esElectrico);
        setCalificacionCliente(calificacionCliente);
    }

    private String nivelCertificacion = "";

    public String getNivelCertificacion() {
        return nivelCertificacion;
    }

    public void setNivelCertificacion(String nivelCertificacion) {
        this.nivelCertificacion = nivelCertificacion;
    }

    @Override
    public double calcularPrecioVentaFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarGuiaDeUsoSeguro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
