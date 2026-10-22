package com.oyarce.damian.model;

import com.oyarce.damian.dto.UsuarioDto;

import java.util.ArrayList;

public class UsuariosModel {
    private final ArrayList<UsuarioDto> usuarios = new ArrayList<>();

    public ArrayList<UsuarioDto> getUsuario() {
        return usuarios;
    }

    public void agregarUsuarios(UsuarioDto usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuarios(UsuarioDto usuario) {
        usuarios.remove(usuario);
    }

    public void actualizarUsuario(UsuarioDto usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(usuario.getId())) {
                usuarios.set(i, usuario);
                break;
            }
        }
    }

}