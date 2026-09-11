/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.oyarce.coleccionjuegos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pv-alumno
 */
public class ColeccionJuegos {

    public static void main(String[] args) {
        List<Juego> listadoJuegos = new ArrayList<>();
        
        Juego uncharted = new Juego("Uncharted 3", 2011);
        listadoJuegos.add(uncharted);
        
        Juego spiderman = new Juego("Marvel's Spiderman", 2018);
        listadoJuegos.add(spiderman);
        
        Juego dragonsDogma = new Juego("Dragon's Dogma", 2013);
        listadoJuegos.add(dragonsDogma);
        
        Juego yoshisIsland = new Juego("Yoshi's Island", 1995);
        listadoJuegos.add(yoshisIsland);
        
        Juego battlefield = new Juego("Battlefield 3", 2011);
        listadoJuegos.add(battlefield);
        
        System.out.println("La lista tiene: " + listadoJuegos.size() + "juegos"); /* Se imprime el tamaño de la lista */
        System.out.println(listadoJuegos.get(0)); /* Se imprime el primer juego de la lista */
        
        System.out.println("Listado de juegos: ");
        for (Juego juego : listadoJuegos) {
            System.out.println(juego);
        }
        
        System.out.println("Se elimina 1 elemento de la lista");
        listadoJuegos.remove(1); /* Se remueve el segundo juego de la lista */
        System.out.println(listadoJuegos.size());
        
        Map<String, Juego> mapaJuegos = new HashMap<>();
        
        mapaJuegos.put("uncharted", uncharted);
        mapaJuegos.put("spiderman", spiderman);
        mapaJuegos.put("dragonsDogma", dragonsDogma);
        mapaJuegos.put("yoshisIsland", yoshisIsland);
        mapaJuegos.put("battlefield", battlefield);

        System.out.println("El mapa tiene: " + mapaJuegos.size() + "juegos");
        System.out.println(mapaJuegos.get("uncharted"));
        
        System.out.println("Listado de juegos (clave y valor): ");
        for (Map.Entry<String, Juego> e : mapaJuegos.entrySet()) {
        System.out.println(e.getKey() + "-->" + e.getValue());
    }
        
        System.out.println("Eliminamos 1 elemento del mapa");
        mapaJuegos.remove("spiderman");
        System.out.println(mapaJuegos.size());
        System.out.println(mapaJuegos.get("spiderman"));

    }
}
