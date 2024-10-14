package epsum.curso.accd.filemanager.clases;

public class Circulo extends Figura{
    double radio;
    String color;

    public Circulo() {}

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es de: " + area+" m2");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es de: " + perimetro+" m");
    }

    @Override
    public String toString() {
        return "CÍRCULO\nRádio: " + radio + "\nColor: " + color+"\n";
    }
}
