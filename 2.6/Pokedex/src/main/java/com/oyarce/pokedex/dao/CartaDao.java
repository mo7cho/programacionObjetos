package com.oyarce.pokedex.dao;

import com.oyarce.pokedex.model.CartaEnergia;
import com.oyarce.pokedex.model.CartaPokemon;

import java.util.List;

public interface CartaDao {

    List<CartaPokemon> leerCartasPokemon();

    List<CartaEnergia> leerCartasEnergia();

    void guardarCartasPokemon(List<CartaPokemon> cartas);

    void guardarCartasEnergia(List<CartaEnergia> cartas);

}
