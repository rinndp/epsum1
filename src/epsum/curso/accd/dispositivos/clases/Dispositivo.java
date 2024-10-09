package epsum.curso.accd.dispositivos.clases;

import java.util.Scanner;

public abstract class Dispositivo {
    Estado estado;
    String marca;

    public Dispositivo() {
        this.estado = Estado.APAGADO;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la marca del dispositivo:");
        this.marca = scanner.nextLine();
    }

    public abstract void encender();

    @Override
    public String toString() {
        return "Dispositivo\n" + "Estado: " + estado + "\nMarca: " + marca + '\n';
    }
}
