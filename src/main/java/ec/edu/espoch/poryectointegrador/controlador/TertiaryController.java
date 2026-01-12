package ec.edu.espoch.poryectointegrador.controlador;

import ec.edu.espoch.poryectointegrador.App;
import ec.edu.espoch.poryectointegrador.dao.SemanaDao;
import ec.edu.espoch.poryectointegrador.modelo.Derivada;
import ec.edu.espoch.poryectointegrador.modelo.ResultadoDao;
import ec.edu.espoch.poryectointegrador.modelo.Semana;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class TertiaryController {
    
    //Atributos
    @FXML
    private ListView<String> listaSemanas;

    @FXML
    private Label lblResultado;
    
    //Metodos
    @FXML
    public void initialize() {

        int contador = 1;
        for (Semana s : SemanaDao.listar()) {
            listaSemanas.getItems().add("Semana " + contador + " = " + s.totalSemana() + " $");
            contador++;
        }

        ResultadoDao r = Derivada.calcular();

        if (r == null) {
            lblResultado.setText("No hay suficientes semanas para analizar.");
            return;
        }

        lblResultado.setText("La semana con mayor crecimiento es la Semana "+ r.getSemanaMayor() + " (" + r.getTotalSemanaMayor() + " $)\n" + "y la semana con menor crecimiento es la Semana " + r.getSemanaMenor() + " (" + r.getTotalSemanaMenor() + " $)" );
    }

    @FXML
    private void regresar() throws IOException {
        App.setRoot("secondary");
    }
}
