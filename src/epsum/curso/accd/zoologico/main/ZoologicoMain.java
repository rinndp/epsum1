package epsum.curso.accd.zoologico.main;

import epsum.curso.accd.zoologico.clases.Animal;
import epsum.curso.accd.zoologico.clases.Zoologico;
import epsum.curso.accd.zoologico.interfaces.Gestionable;

import java.util.ArrayList;

public class ZoologicoMain {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico(new ArrayList<Gestionable>());
        zoologico.agregarInfo();
        System.out.println("----------------------------------------------");
        zoologico.serializar();
        System.out.println("----------------------------------------------");
        zoologico.deserializar();
    }
}
