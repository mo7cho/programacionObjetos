/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oyarce.mavenproject1;

/**
 *
 * @author pv-alumno
 */
public class ArticuloEstandar extends Producto{

    public ArticuloEstandar(String nombre, int garantiaMeses, String categoria, int anioFabricacion, boolean esElectrico, double calificacionCliente) {
        setNombre(nombre);
        setGarantiaMeses(garantiaMeses);
        setCategoria(categoria);
        setAnioFabricacion(anioFabricacion);
        setEsElectrico(esElectrico);
    }
    

    @Override
    public double calcularPrecioVentaFinal() {
        return 25000.0;
    }

    @Override
    public String toString() {
        return "[Tipo: Estándar] " + super.toString();
    }
    
}
