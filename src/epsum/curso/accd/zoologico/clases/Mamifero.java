package epsum.curso.accd.zoologico.clases;

public class Mamifero extends Animal {
    private boolean tienePelo;

    public Mamifero() {}

    public Mamifero(String nombre, int edad, Boolean tienePelo) {
        super(nombre, edad);
        this.tienePelo = tienePelo;
    }


    public Boolean getTienePelo() {
        return tienePelo;
    }

    public void setPelo(Boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    @Override
    public String getTipo() {
        return "MAMÍFERO";
    }

    @Override
    public String toString() {
        String tienePeloString;
        if (tienePelo) {
            tienePeloString = "SI";
        } else {
            tienePeloString = "NO";
        }
        return "DATOS "+getTipo()+"\nNombre: "+nombre+ "\nEdad: "+edad+"\n¿Tiene pelo?: "+tienePeloString+"\n";
    }

}
