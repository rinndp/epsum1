package epsum.curso.accd.vehiculos.main;

import epsum.curso.accd.vehiculos.clases.Bicicleta;
import epsum.curso.accd.vehiculos.clases.Coche;

public class VehiculoMain {
    public static void main(String[] args) {
        Coche coche = new Coche("Nissa", 220, 50.0);
        Bicicleta bicicleta = new Bicicleta("Canyon", 60, "Montaña");

        coche.acelerar();
        bicicleta.acelerar();
        System.out.println("-------------------------------------------------");
        System.out.println(coche);
        System.out.println("-------------------------------------------------");
        System.out.println(bicicleta);
    }
}
