package epsum.curso.accd.dispositivos.clases;

import epsum.curso.accd.dispositivos.interfaces.Conectable;

public class TelefonoInteligente extends Dispositivo implements Conectable {

    public TelefonoInteligente() {}

    public TelefonoInteligente(String marca) {
        this.marca = marca;
    }

    @Override
    public void encender() {
        this.estado = Estado.ENCENDIDO;
        System.out.println("El telefono Inteligente se ha ENCENDIDO");
    }

    @Override
    public void conectarWifi() {
        System.out.println("El telefono Inteligente se ha CONECTADO al WiFi");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("El telefono Inteligente se ha DESCONECTADO al WiFi");
    }

    @Override
    public String toString() {
        return "Teléfono inteligente\n" + "Estado: " + estado + "\nMarca: " + marca + '\n';
    }
}
