package ec.edu.espoch.poryectointegrador.modelo.objetos;

public class Usuarios {

    private String nombre;
    private String contraseña;

    public Usuarios(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
}
