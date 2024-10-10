package epsum.curso.accd.alumnosregistros.clases;

public class Alumno {
    String nombre;
    int edad;
    String ciclo;
    Double notaMedia;

    public Alumno () {}

    public Alumno(String nombre, int edad, String ciclo, Double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.notaMedia = notaMedia;
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

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "DATOS ALUMNO\nNombre: " + nombre + "\nEdad: " + edad + "\nCiclo: " + ciclo + "\nNota Media: " + notaMedia + "\n";
    }
}
