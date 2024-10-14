package epsum.curso.accd.filemanager.clases;

public class Cuadrado extends Figura {
    double lado;
    String color;

    public Cuadrado() {}

    public Cuadrado(double lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es de: " + area+" m2");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = lado * 4;
        System.out.println("El perímetro del cuadrado es de: " + perimetro+" m");
    }

    @Override
    public String toString() {
        return "CUADRADO\nLado: " + lado+"\nColor: "+color+"\n";
    }
}
