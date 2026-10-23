module com.oyarce.heroes {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.oyarce.heroes to javafx.fxml;
    exports com.oyarce.heroes;

    opens com.oyarce.heroes.controller to javafx.fxml;

    opens com.oyarce.heroes.dto to javafx.fxml, com.google.gson, javafx.base;
    exports com.oyarce.heroes.dto;
}