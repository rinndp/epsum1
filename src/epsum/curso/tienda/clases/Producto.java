package epsum.curso.tienda.clases;

import java.util.ArrayList;

public class Producto {
    String nombre;
    double precio;
    int cantidad;


    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.cantidad = 0;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio +"€ " + "\nCantidad: " + cantidad+" uds";
    }
}
