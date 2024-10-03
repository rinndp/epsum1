package epsum.curso.accd.animales.clases;

public class Gato extends Animal {
    protected String tipo;

    public Gato(String nombre, int edad) {
        super(nombre, edad);
        this.tipo = "Gato";
    }

    @Override
    public void hacerSonido() {
        System.out.println("Meow meow");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad +" años" + "\nTipo: " + this.tipo;
    }
}
