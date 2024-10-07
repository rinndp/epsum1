package epsum.curso.accd.vehiculos.clases;

public class CuentaAhorros extends CuentaBancaria {
    private double interesAnual;

    public CuentaAhorros () {}

    public CuentaAhorros(double saldo, double interesAnual) {
        super(saldo);
        this.interesAnual = interesAnual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Se ha DEPOSITADO en la cuenta ahorro correctamente");
    }

    @Override
    public void retirar(double valor) {
        this.saldo -= valor;
        System.out.println("Se ha RETIRADO en la cuenta ahorro correctamente");
    }

    public void calcularInteresAnual() {
        double interes = this.saldo * (this.interesAnual / 100);
        System.out.println("Interes ANUAL de la cuenta de ahorro: " + interes +" €");
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro\n" + "Saldo: " + saldo + "€\nPorcentaje interes: " + interesAnual +"\n";
    }
}
