module com.oyarce.archivos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oyarce.archivos to javafx.fxml;
    exports com.oyarce.archivos;

    opens com.oyarce.archivos.controller to javafx.fxml;
    exports com.oyarce.archivos.controller to javafx.fxml;

    opens com.oyarce.archivos.dto to javafx.fxml;
    exports com.oyarce.archivos.dto to javafx.fxml;

}