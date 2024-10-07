package epsum.curso.accd.vehiculos.main;

import epsum.curso.accd.vehiculos.clases.CuentaAhorros;
import epsum.curso.accd.vehiculos.clases.CuentaCorriente;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(0, 0);
        CuentaAhorros ca = new CuentaAhorros(0, 4.15);

        cc.depositar(1500);
        ca.depositar(3400);
        System.out.println("------------------------------------------");
        System.out.println(cc);
        System.out.println(ca);
        System.out.println("------------------------------------------");
        cc.retirar(20);
        cc.retirar(20);
        cc.retirar(20);
        cc.retirar(20);
        cc.retirar(20);
        cc.retirar(20);
        System.out.println("------------------------------------------");
        System.out.println(cc);
        System.out.println("------------------------------------------");
        ca.calcularInteresAnual();



    }
}
