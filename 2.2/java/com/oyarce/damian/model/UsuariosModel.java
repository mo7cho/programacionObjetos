package com.oyarce.damian.model;

import com.oyarce.damian.dto.UsuarioDto;

import java.util.ArrayList;

public class UsuariosModel {
    private final ArrayList<UsuarioDto> usuarios = new ArrayList<>();

    public ArrayList<UsuarioDto> getUsuario() {
        return usuarios;
    }

    public void agregarUsuarios() {
        usuarios.add(usuario);
    }

    public void eliminarUsuarios() {
        usuarios.remove(usuario);
    }


}
