package epsum.curso.accd.vehiculos.clases;

abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria() {}

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(double valor);

    public abstract void retirar(double valor);
}
