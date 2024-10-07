package epsum.curso.accd.vehiculos.clases;

public class Coche extends Vehiculo {
    Double capacidadCombustible;

    public Coche() {}

    public Coche(String marca, int velocidadMaxima, Double capacidadCombustible) {
        super(marca, velocidadMaxima);
        this.capacidadCombustible = capacidadCombustible;
    }

    public Double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(Double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando COCHE...");
    }

    @Override
    public String toString() {
        return "Coche \nMarca: " + marca + "\nVelocidad máxima: " + velocidadMax + " km/h \nCapacidad combustible: " + capacidadCombustible + " L";
    }
}
