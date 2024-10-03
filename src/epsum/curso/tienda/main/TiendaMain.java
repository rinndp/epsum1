package epsum.curso.tienda.main;

import epsum.curso.tienda.clases.Inventario;
import epsum.curso.tienda.clases.Producto;

import java.util.ArrayList;

public class TiendaMain {
    public static void main(String[] args) {

        ArrayList <Producto> lista = new ArrayList();

        Producto cocaCola = new Producto("Coca-Cola", 2, 5);
        Producto agua = new Producto("Agua", 1, 8);
        Producto pan = new Producto("Barra de pan", 0.5, 13);
        Producto tarta = new Producto("Tarta de chocolate", 15, 13);

        Inventario inventario = new Inventario(lista);

        inventario.añadirProducto(cocaCola);
        inventario.añadirProducto(agua);
        inventario.añadirProducto(pan);
        inventario.añadirProducto(tarta);
        System.out.println("-------------------------------------");
        inventario.mostrarLista();
        System.out.println("-------------------------------------");
        inventario.eliminarProducto(cocaCola);
        System.out.println("-------------------------------------");
        inventario.mostrarLista();
        System.out.println("-------------------------------------");
        inventario.calcularInventario();
    }
}
