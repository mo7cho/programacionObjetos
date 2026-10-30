package com.damian.estudiantes.service;

import com.damian.estudiantes.dto.EstudianteDTO;

import java.util.ArrayList;

public interface IEstudiantesService {

    void registrarEstudiante(EstudianteDTO estudiante);

    ArrayList<EstudianteDTO> obtenerEstudiantes();
}
