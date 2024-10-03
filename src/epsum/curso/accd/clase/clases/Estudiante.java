package epsum.curso.accd.clase.clases;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaFinal;


    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.notaFinal = 0;
    }

    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() { return edad; }

    public double getNotaFinal() { return notaFinal; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad +" años" + "\nNota Final: " + notaFinal;
    }
}
