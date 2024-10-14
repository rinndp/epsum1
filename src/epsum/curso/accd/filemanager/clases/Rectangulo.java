package epsum.curso.accd.filemanager.clases;

public class Rectangulo extends Figura {
    double base;
    double altura;
    String color;

    public Rectangulo () {}

    public Rectangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void calcularArea() {
        double area = base*altura;
        System.out.println("El área del rectángulo es de: " + area+" m2");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2*(base+altura);
        System.out.println("El perímetro del rectángulo es de: " + perimetro+" m");
    }

    @Override
    public String toString() {
        return "RECTANGULO\nBase: " + base + "\nAltura: " + altura+"\nColor: "+color+"\n";
    }
}
