package com.oyarce.pokedex.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PokedexController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
