package com.damian.estudiantes.dao;

import com.damian.estudiantes.dto.EstudianteDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class EstudiantesDAO {

    private String NOMBRE_ARCHIVO = "estudiante.json";
    private Path archivo;
    private Gson gson;

    public EstudiantesDAO(String NOMBRE_ARCHIVO) {
        this.archivo = Path.of(System.getProperty("user.home"), NOMBRE_ARCHIVO);
        System.out.println("EstudiantesDAO archivo: " + this.archivo);
        this.gson = new GsonBuilder().setPrettyPrinting().create();

    }

    public void guardarEstudiantes(ArrayList<EstudianteDTO> estudiantes) {
        try {
            String datos = this.gson.toJson(estudiantes);
            Files.writeString(this.archivo, datos);
        } catch (IOException e) {
            System.out.println("Heroes guardarHeroes: " + e.getMessage());
        }
    }

    public ArrayList<EstudianteDTO> obternerEstudiantes() {
        try {
            String datos = Files.readString(this.archivo);
            Type tipoLista = new TypeToken<ArrayList<EstudianteDTO>>() {}.getType();
            ArrayList<EstudianteDTO> listado = this.gson.fromJson(datos, tipoLista);
            if (listado == null) {
                return new ArrayList<>();
            }
            return listado;
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

}
