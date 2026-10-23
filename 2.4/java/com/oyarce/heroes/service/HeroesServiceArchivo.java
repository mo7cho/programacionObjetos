package com.oyarce.heroes.service;

import com.oyarce.heroes.dao.HeroesDao;
import com.oyarce.heroes.dto.HeroeDto;

import java.util.ArrayList;

public class HeroesServiceArchivo implements IHeroesService {

    private HeroesDao heroesDao;

    public HeroesServiceArchivo() {
        this.heroesDao = new HeroesDao();
    }

    public void crearHeroe(HeroeDto heroe) {
        ArrayList<HeroeDto> listado = this.heroesDao.obtenerHeroes();
        listado.add(heroe);
        this.heroesDao.guardarHeroes(listado);
    }

    @Override
    public ArrayList<HeroeDto> obtenerHeroes() {
        return this.heroesDao.obtenerHeroes();
    }
}
