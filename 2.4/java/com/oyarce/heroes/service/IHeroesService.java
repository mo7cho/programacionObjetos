package com.oyarce.heroes.service;

import com.oyarce.heroes.dto.HeroeDto;

import java.util.ArrayList;

public interface IHeroesService {

    void crearHeroe(HeroeDto heroe);

    ArrayList<HeroeDto> obtenerHeroes();
}
