package com.oyarce.pokedex.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.oyarce.pokedex.model.CartaEnergia;
import com.oyarce.pokedex.model.CartaPokemon;
import netscape.javascript.JSException;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CartaDaoJson implements CartaDao {
    private static final Path ARCHIVO_POKEMON = Paths.get("pokemons.json");
    private static final Path ARCHIVO_ENERGIA = Paths.get("energias.json");

    private static final Type LISTA_POKEMON = new TypeToken<List<CartaPokemon>>() {}.getType();
    private static final Type LISTA_ENERGIA = new TypeToken<List<CartaEnergia>>() {}.getType();

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private <T> List<T> leer(Path archivo, Type tipoLista) {
        if (!Files.exists(archivo)) {
            return new ArrayList<>();
        }
        try (Reader reader = Files.newBufferedReader(archivo)) {
            List<T> datos = gson.fromJson(reader, tipoLista);
            return datos != null ? datos : new ArrayList<>();
        } catch (IOException || JsonParseException e) {
            throw new RuntimeException("No se pudo leer archivo " + archivo.toAbsolutePath(), e);
        }
    }

    private void escribir(Path archivo, Object datos, Type tipoLista) {
        try (Writer writer = Files.newBufferedWriter(archivo)) {
            gson.toJson(datos, tipoLista, writer);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo guardar archivo " + archivo.toAbsolutePath(), e);
        }
    }

    @Override
    public List<CartaPokemon> leerCartasPokemon() {
        return leer(ARCHIVO_POKEMON, LISTA_POKEMON);
    }

    @Override
    public List<CartaEnergia> leerCartasEnergia() {
        return List.of();
    }

    @Override
    public void guardarCartasPokemon(List<CartaPokemon> cartas) {

    }

    @Override
    public void guardarCartasEnergia(List<CartaEnergia> cartas) {

    }
}
