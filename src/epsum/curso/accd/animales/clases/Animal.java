package epsum.curso.accd.animales.clases;

public class Animal {

    protected String nombre;
    protected int edad;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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


    public void hacerSonido() {
        System.out.println("El animal hace sonidos");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad +" años";
    }
}