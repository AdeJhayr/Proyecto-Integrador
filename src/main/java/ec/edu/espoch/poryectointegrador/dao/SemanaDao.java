package ec.edu.espoch.poryectointegrador.dao;
import ec.edu.espoch.poryectointegrador.modelo.Semana;

import java.util.ArrayList;
import java.util.List;

public class SemanaDao {

    private static List<Semana> semanas = new ArrayList<>();

    public static void guardar(Semana semana) {
        semanas.add(semana);
    }

    public static List<Semana> listar() {
        return semanas;
    }
}
