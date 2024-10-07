package epsum.curso.accd.vehiculos.clases;

public class Bicicleta extends Vehiculo {
    String tipoBicicleta;

    public Bicicleta() {}

    public Bicicleta(String marca, int velocidadMaxima, String tipoBicileta) {
        super(marca, velocidadMaxima);
        this.tipoBicicleta = tipoBicileta;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando BICICLETA...");
    }

    @Override
    public String toString() {
        return "Bicicleta \nMarca: " + marca + "\nVelocidad máxima: " + velocidadMax + " km/h\nTipo bicicleta: " + tipoBicicleta;
    }
}
