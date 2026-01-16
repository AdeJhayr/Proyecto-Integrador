package ec.edu.espoch.poryectointegrador.controladorr;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class QuintoController {

    @FXML
    private TextArea TXTAInformacion;

    public void mostrarInformacion(String texto) {
        TXTAInformacion.setText(texto);
    }
    
    @FXML
private void cerrar() {
    Stage stage = (Stage) TXTAInformacion.getScene().getWindow();
    stage.close();
}

}
