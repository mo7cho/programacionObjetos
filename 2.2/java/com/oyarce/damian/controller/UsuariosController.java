package com.oyarce.damian.controller;

import com.oyarce.damian.dto.UsuarioDto;
import com.oyarce.damian.model.UsuariosModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


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

    @FXML
    public Button btnModificar;

    private UsuariosModel usuariosModel;
    private ObservableList<UsuarioDto> usuarios;

    public UsuariosController() {
        this.usuariosModel = new UsuariosModel();
    }

    private Integer idUsuario = 0;

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
            usuarioDto.setTelefono(Integer.valueOf(txtTelefono.getText()));

            if (txtNombre.getText().trim().isEmpty() || txtContrasena.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()) {
                throw new Exception("Datos no pueden estar vacio");
            }

            usuarioDto.setId(this.getIdUsuario());

            this.txtNombre.setText("");
            this.txtContrasena.setText("");
            this.txtCorreo.setText("");
            this.txtTelefono.setText("");

            this.txtNombre.requestFocus();

            System.out.println("Agregando usuario");

            System.out.println(usuarioDto);
            this.usuariosModel.agregarUsuarios(usuarioDto);
            this.usuarios.setAll(this.usuariosModel.getUsuario());

            System.out.println(this.usuariosModel.getUsuario().size());
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    private Integer getIdUsuario() {
        this.idUsuario = this.idUsuario + 1;
        return idUsuario;
    }

    @FXML
    public void handleSeleccionar(MouseEvent mouseEvent) {
        UsuarioDto usuarioDto = (UsuarioDto) this.tableUsuarios.getSelectionModel().getSelectedItem();
        if (usuarioDto != null) {
            this.txtId.setText(usuarioDto.getId().toString());
            this.btnEliminar.setDisable(false);
            this.btnModificar.setDisable(false);
            this.usuarioEliminar = usuarioDto;

        }
    }

    @FXML
    public void handleEliminarUsuario(ActionEvent actionEvent) {
        this.usuariosModel.eliminarUsuarios(this.usuarioEliminar);
        this.usuarios.setAll(this.usuariosModel.getUsuario());
        this.usuarioEliminar = null;
    }

    @FXML
    public void handleModificarUsuario(ActionEvent actionEvent) {
        try {
            if (txtNombre.getText().trim().isEmpty() || txtContrasena.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty() || txtTelefono.getText().trim().isEmpty()) {
                throw new Exception("Los datos no pueden estar vacíos.");
            }

            this.usuarioEliminar.setNombre(txtNombre.getText());
            this.usuarioEliminar.setContrasena(txtContrasena.getText());
            this.usuarioEliminar.setCorreo(txtCorreo.getText());
            this.usuarioEliminar.setTelefono(Integer.valueOf(txtTelefono.getText()));

            this.usuariosModel.actualizarUsuario(this.usuarioEliminar);

            this.usuarios.setAll(this.usuariosModel.getUsuario());

            this.txtNombre.setText("");
            this.txtContrasena.setText("");
            this.txtCorreo.setText("");
            this.txtTelefono.setText("");

            this.txtNombre.requestFocus();


            this.usuarioEliminar = null;
            this.btnEliminar.setDisable(true);
            this.btnModificar.setDisable(true);
            this.txtNombre.requestFocus();

            System.out.println("Usuario modificado con éxito");

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No se pudo modificar");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}


