package com.oyarce.archivos.dto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsuariosDto {

    public static final String NOMBRE_ARCHIVO = "usuarios.json";

    private final Path archivo;


    public UsuariosDto() {
        String directorioUsuario = System.getProperty("user.dir");
        this.archivo = Paths.get(directorioUsuario, NOMBRE_ARCHIVO);
    }

    public void guardarNombre(String nombre) {
        try {
            Files.writeString(this.archivo, "Contenido del archivo: " + nombre);
        } catch (IOException ex) {
            System.out.println("No se pudo guardar el nombre: " + nombre);
        }
    }

    public String leerNombre() {
        String resultado = "";

        if (!Files.exists(this.archivo)) {
            return "";
        }

        try {
            resultado = Files.readString(this.archivo);
        } catch (IOException ex) {
            System.out.println("No se pudo leer el nombre." );
        }
        return resultado;
    }
}
