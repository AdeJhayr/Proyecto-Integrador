package ec.edu.espoch.poryectointegrador.controlador.usocasos;

public class InformacionControlador {

    public String obtenerExplicacionDerivada() {

        return
            "ANÁLISIS DE MÁXIMOS Y MÍNIMOS\n\n" +

            "1) Se toman las ganancias de las últimas 3 semanas:\n" +
            "   g1, g2 y g3\n\n" +

            "2) Se ajusta una función cuadrática:\n" +
            "   f(x) = ax² + bx + c\n\n" +

            "3) Se calculan los coeficientes:\n" +
            "   a = (g3 - 2g2 + g1) / 2\n" +
            "   b = g2 - g1\n" +
            "   c = g1\n\n" +

            "4) Se deriva la función:\n" +
            "   f'(x) = 2ax + b\n\n" +

            "5) Se iguala la derivada a cero:\n" +
            "   2ax + b = 0\n" +
            "   x = -b / (2a)\n\n" +

            "6) Se evalúa la función en el punto crítico usando Math.pow:\n" +
            "   f(x) = a·x² + b·x + c\n\n" +

            "7) Si a < 0 → Máximo\n" +
            "   Si a > 0 → Mínimo\n\n" +

            "Este método permite analizar el crecimiento o decrecimiento\n" +
            "del negocio en función del presupuesto.";
    }
}
