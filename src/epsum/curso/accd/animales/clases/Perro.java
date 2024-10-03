package epsum.curso.accd.animales.clases;

public class Perro extends Animal {
    protected String tipo;

    public Perro(String nombre, int edad) {
        super(nombre, edad);
        this.tipo = "Perro";
    }

    @Override
    public void hacerSonido() {
        System.out.println("Woof woof");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad +" años" + "\nTipo: " + this.tipo;
    }
}
