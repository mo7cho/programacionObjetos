/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oyarce.mavenproject1;

/**
 *
 * @author pv-alumno
 */
public class ProductoLiquidacion extends Producto{

    public ProductoLiquidacion(String nombre, int garantiaMeses, String categoria, boolean esElectrico, double calificacionCliente, int anioOriginal) {
        setNombre(nombre);
        setGarantiaMeses(garantiaMeses);
        setCategoria(categoria);
        setEsElectrico(esElectrico);
    }
    
    private int anioLoteOriginal = 0;

    public int getAnioLoteOriginal() {
        return anioLoteOriginal;
    }

    public void setAnioLoteOriginal(int anioLoteOriginal) {
        this.anioLoteOriginal = anioLoteOriginal;
    }

    
    @Override
    public double calcularPrecioVentaFinal() {
        return 15000.0;
    }

    @Override
    public String toString() {
        return "[Tipo: Liquidación | Lote Original: " + anioLoteOriginal + "] " + super.toString();
    }
    
}
