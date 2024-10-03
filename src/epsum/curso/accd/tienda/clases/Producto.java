package epsum.curso.accd.tienda.clases;

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
        System.out.println("Se ha modificado el nombre de un producto a: " + nombre);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        System.out.println("Se ha modificado el precio de '" +nombre+ "' a: " + precio);
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        System.out.println("Se ha modificado la cantidad de '" +nombre+ "' a: " + cantidad);
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
