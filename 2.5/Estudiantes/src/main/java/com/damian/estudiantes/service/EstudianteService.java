package com.damian.estudiantes.service;

import com.damian.estudiantes.dto.EstudianteDTO;

import java.util.ArrayList;

public class EstudianteService implements IEstudiantesService{

    private ArrayList<EstudianteDTO> estudiante;

    public EstudianteService(ArrayList<EstudianteDTO> estudiante) {
        this.estudiante = new ArrayList<>();
    }

    @Override
    public void registrarEstudiante(EstudianteDTO estudiante) {
        this.estudiante.add(estudiante);
    }

    @Override
    public ArrayList<EstudianteDTO> obtenerEstudiantes() {
        return this.estudiante;
    }
}
