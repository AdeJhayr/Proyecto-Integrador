package ec.edu.espoch.poryectointegrador.modelo;
import java.util.ArrayList;
import java.util.List;

public class Semana {
    
    //Atributos
    private double lunes;
    private double martes;
    private double miercoles;
    private double jueves;
    private double viernes;
    private double sabado;
    
    //Constructor
    public Semana(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
    }
    
    //Getters
    public double getLunes() {
        return lunes;
    }

    public double getMartes() {
        return martes;
    }

    public double getMiercoles() {
        return miercoles;
    }

    public double getJueves() {
        return jueves;
    }

    public double getViernes() {
        return viernes;
    }

    public double getSabado() {
        return sabado;
    }
    
    //Metodos
 public double totalSemana() {
        return lunes + martes + miercoles + jueves + viernes + sabado;
    }
}