package ec.edu.espoch.poryectointegrador.modelo.implementacion;

import ec.edu.espoch.poryectointegrador.modelo.interfaz.IUsuario;
import ec.edu.espoch.poryectointegrador.modelo.objetos.Usuarios;

public class Inicio implements IUsuario {

    private Usuarios usuarioSistema;

    public Inicio() {
        this.usuarioSistema = new Usuarios("admin", "admin");
    }

    @Override
    public boolean validar(String nombre, String contraseña) {
        return usuarioSistema.getNombre().equals(nombre)
            && usuarioSistema.getContraseña().equals(contraseña);
    }
}
