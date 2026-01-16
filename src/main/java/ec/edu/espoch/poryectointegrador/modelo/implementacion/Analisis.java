package ec.edu.espoch.poryectointegrador.modelo.implementacion;

import ec.edu.espoch.poryectointegrador.modelo.interfaz.IAnalisis;
import ec.edu.espoch.poryectointegrador.modelo.objetos.Semanas;
import java.util.List;

public class Analisis implements IAnalisis {

    @Override
    public String analizar(List<Semanas> semanas, double presupuesto) {

        if (semanas.size() < 3) {
            return "Se necesitan al menos 3 semanas para el análisis.";
        }

        int n = semanas.size();

        // Ganancias
        double g1 = semanas.get(n - 3).getGanancia();
        double g2 = semanas.get(n - 2).getGanancia();
        double g3 = semanas.get(n - 1).getGanancia();

        // Ajuste función cuadrática f(x)=ax²+bx+c
        double a = (g3 - 2 * g2 + g1) / 2;
        double b = g2 - g1;
        double c = g1;

        // Derivada f'(x)=2ax+b
        double xCritico = -b / (2 * a);

        // Evaluación con Math
        double valor = a * Math.pow(xCritico, 2) + b * xCritico + c;

        if (a < 0) { // parábola hacia abajo → máximo
            if (valor > presupuesto) {
                return "El negocio presenta un MÁXIMO de ganancia. Crecimiento favorable.";
            } else {
                return "El negocio alcanzó un máximo, pero no supera el presupuesto.";
            }
        } else { // parábola hacia arriba → mínimo
            if (valor > presupuesto) {
                return "El negocio se encuentra en un MÍNIMO, pero supera el presupuesto. Estabilidad.";
            } else {
                return "El negocio se encuentra en un MÍNIMO. Riesgo de decrecimiento.";
            }
        }

    }

    @Override
    public void agregarSemana(double ingreso, double gasto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String analizar(double presupuesto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Semanas> obtenerSemanas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String analizarCrecimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
