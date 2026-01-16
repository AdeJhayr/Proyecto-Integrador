package ec.edu.espoch.poryectointegrador.controlador.usocasos;

import ec.edu.espoch.poryectointegrador.modelo.implementacion.Inicio;
import ec.edu.espoch.poryectointegrador.modelo.interfaz.IUsuario;

public class ControladorUsuario {

    private IUsuario usuario;

    public ControladorUsuario() {
        this.usuario = new Inicio();
    }

    // CASO DE USO
    public String iniciarSesion(String nombre, String contraseña) {

        boolean acceso = usuario.validar(nombre, contraseña);

        if (acceso) {
            return "ACCESO_OK";
        } else {
            return "Usuario o contraseña incorrectos";
        }
    }
}
