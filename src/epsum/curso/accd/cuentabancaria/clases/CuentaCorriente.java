package epsum.curso.accd.vehiculos.clases;

public class CuentaCorriente extends CuentaBancaria {
    private int envios;

    public CuentaCorriente() {}

    public CuentaCorriente(double saldo, int envios) {
        super(saldo);
        this.envios = envios;
    }

    public double getEnvios() {
        return envios;
    }

    public void setEnvios(int envios) {
        this.envios = envios;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Se ha DEPOSITADO en la cuenta corriente correctamente");

    }

    public void retirar(double valor) {
        if (this.envios <= 4) {
            saldo -= valor;
            System.out.println("Se ha RETIRADO en la cuenta corriente correctamente");
            envios++;
        } else {
            System.out.println("Error! Número de envíos superado (5)");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Corriente\n" + "Saldo: " + saldo + "€\nEnvios: " + envios +"\n";
    }
}
