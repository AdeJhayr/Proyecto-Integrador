package ec.edu.espoch.poryectointegrador.modelo.interfaz;

import java.util.List;
import ec.edu.espoch.poryectointegrador.modelo.objetos.Semanas;

public interface IAnalisis {

    void agregarSemana(double ingreso, double gasto);

    String analizar(List<Semanas> semanas, double presupuesto);

    String analizar(double presupuesto);

    List<Semanas> obtenerSemanas();

    String analizarCrecimiento();
}
