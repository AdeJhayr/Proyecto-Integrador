module ec.edu.espoch.poryectointegrador {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espoch.poryectointegrador to javafx.fxml;
    exports ec.edu.espoch.poryectointegrador;
}
