package epsum.curso.accd.zoologico.clases;

public class Ave extends Animal {
    private boolean puedeVolar;

    public Ave() {}

    public Ave(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }

    public boolean getPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String getTipo() {
        return "AVE";
    }

    @Override
    public String toString() {
        String puedeVolarString;
        if (puedeVolar) {
            puedeVolarString = "SI";
        } else {
            puedeVolarString = "NO";
        }
        return "DATOS "+getTipo()+"\nNombre: "+nombre+ "\nEdad: "+edad+"\n¿Puede volar?: "+puedeVolarString+"\n";
    }
}
