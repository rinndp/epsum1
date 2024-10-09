package epsum.curso.accd.empleados.clases;

import epsum.curso.accd.empleados.interfaces.Autenticable;
import epsum.curso.accd.empleados.interfaces.Bonificable;

import java.io.Serializable;

public class Programador extends Empleado implements Autenticable, Bonificable {
    public Programador() {}

    public Programador(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase, bono);
    }

    public void calcularSalario() {
        double salarioTotal;
        salarioTotal = this.getSalarioBase() + this.getSalarioBase() * (this.getBono() / 100);
        System.out.println("El salario total de '"+this.getNombre()+"' es: "+salarioTotal+"€");
    }

    public void iniciarSesion(String usuario, String contraseña) {
        this.usuario = usuario;
        this.estadoSesion = sesiones.INICIADA;
        System.out.println("Se ha iniciado sesión con el usuario: "+usuario);
    }

    public void cerrarSesion() {
        this.estadoSesion = sesiones.CERRADA;
        System.out.println("Se ha cerrado sesión con el usuario: "+this.usuario);
    }

    @Override
    public void calcularBono() {
        double bonoTotal;
        bonoTotal = this.getSalarioBase() * this.getBono();
        System.out.println("El bono de '"+this.getNombre()+"' es: "+bonoTotal+"€");
    }

    @Override
    public String toString() {
        return "Programador\n" + "Nombre: " + nombre + "\nSalario base=" + salarioBase + "\nPorcentaje bono: " + bono +"\nUsuario: " + usuario +"\nSesión: "+estadoSesion+"\n";
    }
}
