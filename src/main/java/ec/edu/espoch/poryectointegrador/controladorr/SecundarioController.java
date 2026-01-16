package ec.edu.espoch.poryectointegrador.controladorr;

import ec.edu.espoch.poryectointegrador.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecundarioController {

    @FXML
    private Button BTLista;

    @FXML
    private Button BTNuevo;

    @FXML
    private Button BTSalir;

    @FXML
    private void nuevo() throws IOException {
        App.setRoot("terciario");
    }

    @FXML
    private void informacion() throws IOException {
        App.setRoot("quinto");
    }

    @FXML
    private void salir() {
        Stage stage = (Stage) BTSalir.getScene().getWindow();
        stage.close();
    }
}
