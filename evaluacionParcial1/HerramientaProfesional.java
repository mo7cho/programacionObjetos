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
        double precioBase = 50000.0;
        if ("Industrial".equalsIgnoreCase(nivelCertificacion)) {
            return precioBase + 20000.0;
        } else if ("Comercial".equalsIgnoreCase(nivelCertificacion)) {
            return precioBase + 10000.0;
        }
        return precioBase;
    }

    @Override
    public void mostrarGuiaDeUsoSeguro() {
        System.out.println("  ↳ [GUÍA DE SEGURIDAD]: Usar EPP completo (gafas, guantes), verificar aislamiento eléctrico y operar según certificación " + nivelCertificacion.toUpperCase() + ".");
    }

    @Override
    public String toString() {
        return "[Tipo: Profesional | Certificación: " + nivelCertificacion + "] " + super.toString();
    }

}
