module ec.edu.espoch.poryectointegrador {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espoch.poryectointegrador.controlador to javafx.fxml;
    exports ec.edu.espoch.poryectointegrador;
}
