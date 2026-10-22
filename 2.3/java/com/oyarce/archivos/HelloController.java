package com.oyarce.archivos;

import com.oyarce.archivos.dto.UsuariosDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtNombre;

    @FXML
    private Label lblResultado;

    UsuariosDto usuariosDto = new UsuariosDto();

    @FXML
    public void onGuardar(ActionEvent actionEvent) {
        String nombre = txtNombre.getText();
        this.usuariosDto.guardarNombre(nombre);
    }

    public void onLeer(ActionEvent actionEvent) {
        String nombre = this.usuariosDto.leerNombre();
        this.lblResultado.setText(nombre);
    }

}
