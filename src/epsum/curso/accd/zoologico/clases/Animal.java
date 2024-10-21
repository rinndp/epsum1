package epsum.curso.accd.zoologico.clases;

import epsum.curso.accd.zoologico.interfaces.Gestionable;

import java.io.Serializable;

public abstract class Animal implements Serializable, Gestionable {
    protected String nombre;
    protected int edad;

    public Animal () {}

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
