package epsum.curso.accd.dispositivos.clases;

import epsum.curso.accd.dispositivos.interfaces.Conectable;

public class Tablet extends Dispositivo implements Conectable {

    public Tablet() {}

    @Override
    public void encender() {
        this.estado = Estado.ENCENDIDO;
        System.out.println("La tablet se ha ENCENDIDO");
    }

    @Override
    public void conectarWifi() {
        System.out.println("La tablet se ha CONECTADO al WiFi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("La tablet se ha DESCONECTADO al WiFi");
    }
}
