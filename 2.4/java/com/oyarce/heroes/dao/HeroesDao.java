package com.oyarce.heroes.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.oyarce.heroes.dto.HeroeDto;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class HeroesDao {
    private String NOMBRE_ARCHIVO = "heroes.json";
    private Path archivo;
    private Gson gson;

    public HeroesDao() {
        this.archivo = Path.of(System.getProperty("user.home"), NOMBRE_ARCHIVO);
        System.out.println("HeroesDao: archivo" + this.archivo);
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void guardarHeroes(ArrayList<HeroeDto> heroes) {
        try {
            String json = this.gson.toJson(heroes);
            Files.writeString(this.archivo, "");
        } catch (IOException e) {
            System.out.println("HeroesDao guardarHeroes: " + e.getMessage());
        }
    }

    public ArrayList<HeroeDto> obtenerHeroes() {
        try {
            String datos = Files.readString(this.archivo);
            Type tipoLista = new TypeToken<ArrayList<HeroesDao>>() {}.getType();
            ArrayList<HeroeDto> listado = this.gson.fromJson(datos, tipoLista);
            if (listado == null) {
                return new ArrayList<>();
            }
            return listado;

        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

}
