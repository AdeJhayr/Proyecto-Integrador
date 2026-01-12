package ec.edu.espoch.poryectointegrador.controlador;

import ec.edu.espoch.poryectointegrador.App;
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
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
        @FXML
    private void lista() throws IOException {
       App.setRoot("tertiary");
    }
    
    //Sale del programa
    @FXML
    private void salir() {
        System.exit(0);
    }
}