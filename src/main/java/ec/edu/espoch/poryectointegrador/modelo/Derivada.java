package ec.edu.espoch.poryectointegrador.modelo;

import ec.edu.espoch.poryectointegrador.dao.SemanaDao;
import java.util.List;

public class Derivada {
    
    
    //Metidos
    public static ResultadoDao calcular() {
        
        //Obtiene datos lista
        List<Semana> semanas = SemanaDao.listar();

        if (semanas.size() < 2) {
            return null;
        }
           
        //Variables de control
        double mayorCrecimiento = Double.NEGATIVE_INFINITY;
        double menorCrecimiento = Double.POSITIVE_INFINITY;

        int semanaMayor = 0;
        int semanaMenor = 0;

        for (int i = 1; i < semanas.size(); i++) {
            
            //Derivada Discreta
            double actual = semanas.get(i).totalSemana();
            double anterior = semanas.get(i - 1).totalSemana();

            double derivada = actual - anterior;
            
            //Crecimiento
            if (derivada > mayorCrecimiento) {
                mayorCrecimiento = derivada;
                semanaMayor = i + 1;
            }
            
            
            //Drecrecimiento xd
            if (derivada < menorCrecimiento) {
                menorCrecimiento = derivada;
                semanaMenor = i + 1;
            }
        }
        
        
        return new ResultadoDao(
            semanaMayor, semanas.get(semanaMayor - 1).totalSemana(),
            semanaMenor, semanas.get(semanaMenor - 1).totalSemana()
        );
    }
}
