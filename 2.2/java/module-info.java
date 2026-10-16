module com.oyarce.damian {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.oyarce.damian to javafx.fxml;
    exports com.oyarce.damian;
}