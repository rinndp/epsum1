package epsum.curso.accd.cuentabancaria.clases;

import epsum.curso.accd.cuentabancaria.interfaces.Conectable;
import epsum.curso.accd.cuentabancaria.interfaces.Recargable;

import java.io.Serializable;

public class Telefono implements Conectable, Recargable {
    boolean cargado = false;

    public Telefono() {}

    @Override
    public void encender() {
        System.out.println("Teléfono encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Teléfono apagado");
    }

    @Override
    public void cargar() {
        cargado = true;
        System.out.println("El teléfono se ha cargado");
    }

    @Override
    public void nivelBateria() {
        if (cargado)
            System.out.println("La batería del teléfono está al 100%");
        else
            System.out.println("El telefono NO está cargado");
    }
}
