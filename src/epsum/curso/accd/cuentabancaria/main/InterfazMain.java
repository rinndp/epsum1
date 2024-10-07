package epsum.curso.accd.cuentabancaria.main;

import epsum.curso.accd.cuentabancaria.clases.Ordenador;
import epsum.curso.accd.cuentabancaria.clases.Telefono;

public class InterfazMain {
    public static void main(String[] args) {
        Telefono telefono = new Telefono();
        Ordenador ordenador = new Ordenador();

        telefono.encender();
        telefono.apagar();
        System.out.println("----------------------------------------------------");
        ordenador.encender();
        ordenador.apagar();
        System.out.println("----------------------------------------------------");
        telefono.cargar();
        telefono.nivelBateria();
    }
}
