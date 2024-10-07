package epsum.curso.accd.vehiculos.clases;

public class Vehiculo {
    String marca;
    protected int velocidadMax;

    public Vehiculo() {}

    public Vehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void acelerar() {
        System.out.println("Acelerando VEHICULO...");
    }

    @Override
    public String toString() {
        return "Vehiculo \nMarca: " + marca + "\nVelocidad máxima: " + velocidadMax +" km/h";
    }
}
