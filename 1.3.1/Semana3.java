/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana3;

/**
 *
 * @author pv-alumno
 */
public class Semana3 {

    public static void main(String[] args) {
        SerVivo cachupin  = new Animal(12, "Cachupin");
        cachupin.hacerSonido();
        System.out.println(cachupin.toString());

        
        SerVivo rallan = new Persona(43, "Rallan");
        rallan.hacerSonido();
        System.out.println(rallan.toString());
        
        Influencer xocas = new Influencer(99, "Xocas", 10000);
        xocas.hacerSonido();
        System.out.println(xocas.toString());
        
    }
}
