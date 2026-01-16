package ec.edu.espoch.poryectointegrador.modelo.objetos;

public class Semanas {

    private int numeroSemana;
    private double ingreso;
    private double gasto;

    public Semanas(int numeroSemana, double ingreso, double gasto) {
        this.numeroSemana = numeroSemana;
        this.ingreso = ingreso;
        this.gasto = gasto;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public double getIngreso() {
        return ingreso;
    }

    public double getGasto() {
        return gasto;
    }

    public double getGanancia() {
        return ingreso - gasto;
    }
}
