package epsum.curso.accd.zoologico.clases;

import epsum.curso.accd.zoologico.interfaces.Gestionable;

import java.io.Serializable;

public class Cuidador implements Serializable, Gestionable {
    String nombre;
    String area;

    public Cuidador (){}

    public Cuidador(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return "CUIDADOR";
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DATOS "+getTipo()+"\nNombre: "+nombre+"\nArea: "+area+"\n";
    }
}
