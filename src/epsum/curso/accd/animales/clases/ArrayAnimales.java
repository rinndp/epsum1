package epsum.curso.accd.animales.clases;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayAnimales {
    ArrayList <Animal> listaAnimales = new ArrayList<>();

    public ArrayAnimales(){}

    public ArrayAnimales(ArrayList <Animal> listaAnimales){
        this.listaAnimales = listaAnimales;
    }

    public void añadirAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println("Se ha añadido un animal: "+ animal.getNombre());
    }

    public void mostrarAnimales(){
        int cont = 1;
        for(Animal animal : listaAnimales){
            System.out.println("Animal "+cont + "\n" + animal + "\n");
            cont++;
        }
    }

    public void eliminarAnimal(String nombreIntroducido) {
        Iterator<Animal> iterator = this.listaAnimales.iterator();
        boolean salir = false;
        while (!salir) {
            Animal animal = iterator.next();
            if (nombreIntroducido.equalsIgnoreCase(animal.getNombre())) {
                iterator.remove();
                System.out.println("Se ha eliminado un animal: " + animal.getNombre());
                salir = true;
            }
        }
    }

}
