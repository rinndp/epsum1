package epsum.curso.accd.empleados.interfaces;

public interface Autenticable {
    public void iniciarSesion(String usuario, String contraseña);
    public void cerrarSesion();

}
