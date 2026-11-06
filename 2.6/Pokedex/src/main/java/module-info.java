module com.oyarce.pokedex {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires jdk.jsobject;


    opens com.oyarce.pokedex to javafx.fxml;
    exports com.oyarce.pokedex;

    opens com.oyarce.pokedex.controller to javafx.fxml;
    exports com.oyarce.pokedex.controller;

    opens com.oyarce.pokedex.model to javafx.fxml;
    exports com.oyarce.pokedex.model;
}