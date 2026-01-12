package ec.edu.espoch.poryectointegrador.modelo;

public class ResultadoDao {

    //Atributos
    private int semanaMayor;
    private double totalSemanaMayor;
    private int semanaMenor;
    private double totalSemanaMenor;
    
    //Constructor
    public ResultadoDao(int semanaMayor, double totalSemanaMayor, int semanaMenor, double totalSemanaMenor) {
        this.semanaMayor = semanaMayor;
        this.totalSemanaMayor = totalSemanaMayor;
        this.semanaMenor = semanaMenor;
        this.totalSemanaMenor = totalSemanaMenor;
    }
    
    //Getters
    public int getSemanaMayor() {
        return semanaMayor;
    }

    public double getTotalSemanaMayor() {
        return totalSemanaMayor;
    }

    public int getSemanaMenor() {
        return semanaMenor;
    }

    public double getTotalSemanaMenor() {
        return totalSemanaMenor;
    }
}
