package ec.edu.espoch.poryectointegrador.controlador.usocasos;

import ec.edu.espoch.poryectointegrador.modelo.implementacion.Analisis;
import ec.edu.espoch.poryectointegrador.modelo.interfaz.IAnalisis;
import ec.edu.espoch.poryectointegrador.modelo.objetos.Semanas;
import java.util.ArrayList;
import java.util.List;

public class ControladorAnalisis {

    private List<Semanas> semanas;
    private double presupuesto;
    private IAnalisis analisis;

    public ControladorAnalisis() {
        semanas = new ArrayList<>();
        analisis = new Analisis();
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void agregarSemana(Semanas semana) {
        semanas.add(semana);
    }

    public String analizar() {
        return analisis.analizar(semanas, presupuesto);
    }

    public List<Semanas> getSemanas() {
        return semanas;
    }
}
