module com.oyarce.damian {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires javafx.graphics;

    opens com.oyarce.damian to javafx.fxml;
    opens com.oyarce.damian.controller to javafx.fxml;
    opens com.oyarce.damian.dto to javafx.base;

    exports com.oyarce.damian;

}