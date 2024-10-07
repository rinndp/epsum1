package epsum.curso.accd.cuentabancaria.clases;

import epsum.curso.accd.cuentabancaria.interfaces.Conectable;

public class Ordenador implements Conectable {

    public Ordenador() {}

    @Override
    public void encender() {
        System.out.println("Ordenador encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Ordenador apagado");
    }
}
