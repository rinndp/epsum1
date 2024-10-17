package epsum.curso.accd.empleadosserializable.clases;

import java.io.Serializable;

public class Empleado implements Serializable {
    private static long serialVersionUID = 1L;

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {}

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "DATOS EMPLEADO\nNombre: "+nombre+"\nEdad: "+edad+"\nSalario: "+salario+"\n";
    }
}
