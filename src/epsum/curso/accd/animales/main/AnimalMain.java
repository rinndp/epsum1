package epsum.curso.accd.animales.main;

import epsum.curso.accd.animales.clases.Animal;
import epsum.curso.accd.animales.clases.ArrayAnimales;
import epsum.curso.accd.animales.clases.Gato;
import epsum.curso.accd.animales.clases.Perro;

import java.util.ArrayList;

public class AnimalMain{
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        Perro perro1 = new Perro("Bob", 4);
        Perro perro2 = new Perro("Agatha", 2);
        Gato gato1 = new Gato("Missu", 1);
        Gato gato2 = new Gato("Gordo", 6);


        ArrayAnimales arrayAnimales = new ArrayAnimales(listaAnimales);
        arrayAnimales.añadirAnimal(perro1);
        arrayAnimales.añadirAnimal(perro2);
        arrayAnimales.añadirAnimal(gato1);
        arrayAnimales.añadirAnimal(gato2);
        System.out.println("-------------------------------------");
        arrayAnimales.mostrarAnimales();
        System.out.println("-------------------------------------");
        arrayAnimales.eliminarAnimal("Agatha");
        System.out.println("-------------------------------------");
        arrayAnimales.mostrarAnimales();

    }
}
