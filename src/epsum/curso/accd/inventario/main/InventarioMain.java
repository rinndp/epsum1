package epsum.curso.accd.inventario.main;

import epsum.curso.accd.inventario.clases.GestorInventario;

import java.util.Scanner;

public class InventarioMain {
    public static void main(String[] args) {
        GestorInventario gestorInventario = new GestorInventario();
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nGESTOR DE INVENTARIO\n0 - Salir\n1 - Leer inventario archivo .txt\n2 - Agregar producto\n3 - Mostar información");
            String resp = scanner.nextLine();
            switch (resp) {
                case "0":
                    System.exit(0);
                    salir = true;
                    break;

                case "1":
                    gestorInventario.obtenerInformacionArchivo();
                    break;

                case "2":
                    gestorInventario.agregarProducto();
                    break;

                case "3":
                    gestorInventario.mostrarProductos();

                default:
                    System.err.println("OPCIÓN NO VÁLIDA");
                    break;
            }
        } while (!salir);
    }
}
