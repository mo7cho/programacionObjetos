package com.oyarce.heroes.service;

import com.oyarce.heroes.dto.HeroeDto;

import java.util.ArrayList;

public class HeroesService implements IHeroesService{

    private ArrayList<HeroeDto> heroes;

    @Override
    public void crearHeroe(HeroeDto heroe) {
        this.heroes.add(heroe);
    }

    @Override
    public ArrayList<HeroeDto> obtenerHeroes() {
        return this.heroes;
    }
}
