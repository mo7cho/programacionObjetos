module com.damian.estudiantes {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.damian.estudiantes to javafx.fxml;
    exports com.damian.estudiantes;
    exports com.damian.estudiantes.controller;
    opens com.damian.estudiantes.controller to javafx.fxml;
}