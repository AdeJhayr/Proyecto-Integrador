package ec.edu.espoch.poryectointegrador.controladorr;

import ec.edu.espoch.poryectointegrador.App;
import ec.edu.espoch.poryectointegrador.controlador.usocasos.ControladorAnalisis;
import ec.edu.espoch.poryectointegrador.controlador.usocasos.InformacionControlador;
import ec.edu.espoch.poryectointegrador.modelo.objetos.Semanas;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TerciarioController implements Initializable {

    private InformacionControlador informacionControlador;
    private ControladorAnalisis controladorAnalisis;
    private int semanaActual = 1;

    @FXML
    private TextField TXTPresupuesto;

    @FXML
    private TextField TXTIngreso;

    @FXML
    private TextField TXTGastos;

    @FXML
    private Label LBSemana;

    @FXML
    private Label LBRespuesta;

    @FXML
    private ListView<String> LTLista;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        controladorAnalisis = new ControladorAnalisis();
        informacionControlador = new InformacionControlador(); // ✅ AQUÍ
        LBSemana.setText("Semana " + semanaActual);
    }

    @FXML
    private void guardar() {

        // Presupuesto solo una vez
        if (semanaActual == 1) {
            double presupuesto = Double.parseDouble(TXTPresupuesto.getText());
            controladorAnalisis.setPresupuesto(presupuesto);
            TXTPresupuesto.setDisable(true);
        }

        double ingreso = Double.parseDouble(TXTIngreso.getText());
        double gasto = Double.parseDouble(TXTGastos.getText());

        Semanas semana = new Semanas(semanaActual, ingreso, gasto);
        controladorAnalisis.agregarSemana(semana);

        LTLista.getItems().add(
                "Semana " + semanaActual
                + " | Ingreso: " + ingreso
                + " | Gasto: " + gasto
        );

        semanaActual++;
        LBSemana.setText("Semana " + semanaActual);

        TXTIngreso.clear();
        TXTGastos.clear();
    }

    @FXML
    private void analizar() {
        String resultado = controladorAnalisis.analizar();
        LBRespuesta.setText(resultado);
    }

    @FXML
    private void regresar() throws IOException {
        App.setRoot("secundario");
    }

    @FXML
    void informacion(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/ec/edu/espoch/poryectointegrador/vista/quinto.fxml"
                )
        );

        Parent root = loader.load();

        QuintoController controller = loader.getController();
        controller.mostrarInformacion(
                informacionControlador.obtenerExplicacionDerivada()
        );

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Información del Análisis");
        stage.show();
    }
}
