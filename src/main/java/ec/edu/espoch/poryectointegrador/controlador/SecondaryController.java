package ec.edu.espoch.poryectointegrador.controlador;
import ec.edu.espoch.poryectointegrador.modelo.Semana;

import ec.edu.espoch.poryectointegrador.App;
import ec.edu.espoch.poryectointegrador.dao.SemanaDao;
import ec.edu.espoch.poryectointegrador.modelo.Derivada;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class SecondaryController {

    //Atributos 
    @FXML
    private TextField TxtLunes;
    @FXML
    private TextField TxtMartes;
    @FXML
    private TextField TxtMiercoles;
    @FXML
    private TextField TxtJueves;
    @FXML
    private TextField TxtViernes;
    @FXML
    private TextField TxtSabado;
    @FXML
    private Label TotalS;
    @FXML
    private Button BTGuardarSemana;
    @FXML
    private Button BTLista;
    @FXML
    private Button secondaryButton;


    //Metodos
    @FXML
    private void regresar() throws IOException {
        App.setRoot("primary");
    }
    
        @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("tertiary");
    }
    
    @FXML
    void Semana(ActionEvent event) {
        //Regista los datos del TextField
        double lunes = Integer.parseInt(TxtLunes.getText());
        double martes = Integer.parseInt(TxtMartes.getText());
        double miercoles = Integer.parseInt(TxtMiercoles.getText());
        double jueves = Integer.parseInt(TxtJueves.getText());
        double viernes = Integer.parseInt(TxtViernes.getText());
        double sabado = Integer.parseInt(TxtSabado.getText());

        //Objetos
       Semana semana = new Semana(lunes, martes, miercoles, jueves, viernes, sabado);
       
       //Se gurada cada semana
        SemanaDao.guardar(semana);
        
        
        double total = semana.totalSemana();
        //Mensaje 
        TotalS.setText(String.valueOf("El total es: " + total));

    }
    
    
       

}


