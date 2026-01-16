package ec.edu.espoch.poryectointegrador.controladorr;

import ec.edu.espoch.poryectointegrador.App;
import ec.edu.espoch.poryectointegrador.controlador.usocasos.ControladorUsuario;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrimarioController implements Initializable {

    @FXML
    private TextField TXTUsuario;

    @FXML
    private PasswordField TXTContraseña;

    @FXML
    private Label LBMensaje;
    
    
    @FXML
    private Button BTInicio;

    @FXML
    private Button BTSalir;

    private ControladorUsuario controladorUsuario;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        controladorUsuario = new ControladorUsuario();
    }

    @FXML
    private void iniciarSesion()throws IOException{

        String usuario = TXTUsuario.getText();
        String contraseña = TXTContraseña.getText();

        // EL CONTROLADOR NO DECIDE
        String resultado = controladorUsuario.iniciarSesion(usuario, contraseña);

        if (resultado.equals("ACCESO_OK")) {
            App.setRoot("secundario");
        } else {
            LBMensaje.setText(resultado);
        }
    }

    @FXML
    private void salir() {
        Stage stage = (Stage) BTSalir.getScene().getWindow();
        stage.close();
    }
}
