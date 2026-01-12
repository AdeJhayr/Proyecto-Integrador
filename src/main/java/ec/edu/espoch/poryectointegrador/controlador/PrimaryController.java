package ec.edu.espoch.poryectointegrador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    
    //Atributos
    @FXML
    private Button derivacionSemanal;

    @FXML
    private Button salir;
    
    
    //Metodos
    
    //Hace que diriga a la segunda ventana
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    //Sale del programa
    @FXML
    private void salir() {
        System.exit(0);
    }
}