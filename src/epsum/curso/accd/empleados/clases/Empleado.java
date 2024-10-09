package epsum.curso.accd.empleados.clases;

public abstract class Empleado {
    String nombre;
    double salarioBase;
    double bono;
    sesiones estadoSesion;
    String usuario;

    public Empleado() {}

    public Empleado(String nombre, double salarioBase, double bono) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract void calcularSalario();

    @Override
    public String toString() {
        return "Empleado\n" + "Nombre: " + nombre + "\nSalario base=" + salarioBase + "\nPorcentaje bono: " + bono +"\nUsuario: " + usuario +"\nSesión: "+estadoSesion+"\n";
    }
}
