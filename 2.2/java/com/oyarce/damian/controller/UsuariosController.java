package com.oyarce.damian.controller;

import com.oyarce.damian.dto.UsuarioDto;
import com.oyarce.damian.model.UsuariosModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class UsuariosController {
    UsuarioDto usuarioEliminar;

    @FXML
    public TableView tableUsuarios;

    @FXML
    public TableColumn colId;
    @FXML
    public TableColumn colNombre;
    @FXML
    public TableColumn colContrasena;
    @FXML
    public TableColumn colCorreo;
    @FXML
    public TableColumn colTelefono;

    @FXML
    public TextField txtId;

    @FXML
    public TextField txtNombre;

    @FXML
    public TextField txtContrasena;

    @FXML
    public TextField txtCorreo;

    @FXML
    public TextField txtTelefono;

    @FXML
    public Button btnEliminar;

    private UsuariosModel usuariosModel;
    private ObservableList<UsuarioDto> usuarios;

    public UsuariosController() {
        this.usuariosModel = new UsuariosModel();
    }

    private Integer idUsuarios = 0;

    @FXML
    public void initialize() {
        this.colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colContrasena.setCellValueFactory(new PropertyValueFactory<>("contrasena"));
        this.colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        this.colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        this.usuarios = FXCollections.observableArrayList();
        this.tableUsuarios.setItems(this.usuarios);
    }

    @FXML
    public void handleAgregarUsuario(ActionEvent actionEvent) {
        try {
            UsuarioDto usuarioDto = new UsuarioDto();
            usuarioDto.setNombre(txtNombre.getText());
            usuarioDto.setContrasena(txtContrasena.getText());
            usuarioDto.setCorreo(txtCorreo.getText());
            usuarioDto.setTelefono(txtTelefono.getText());
        }
    }

}
