package epsum.curso.accd.zoologico.main;

import epsum.curso.accd.zoologico.clases.Animal;
import epsum.curso.accd.zoologico.clases.Zoologico;

import java.util.ArrayList;

public class ZoologicoMain {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico(new ArrayList<Animal>());
        zoologico.agregarAnimal();

        zoologico.serializar();
        zoologico.deserializar();
    }
}
