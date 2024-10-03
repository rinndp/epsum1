package epsum.curso.tienda.clases;

import java.util.ArrayList;

public class Inventario {
    ArrayList<Producto> lista;

    public Inventario() {}

    public Inventario(ArrayList<Producto> lista) {
        this.lista = lista;
    }

    public void añadirProducto(Producto producto) {
        lista.add(producto);
        System.out.println("Se ha añadido el producto: "+producto.getNombre());
    }

    public void eliminarProducto(Producto producto) {
        lista.remove(producto);
        System.out.println("Se ha eliminado el producto: "+producto.getNombre());
    }

    public void mostrarLista() {
        int i = 1;
        for (Producto producto : this.lista) {
            System.out.println("Producto "+i +"\n" + producto +"\n");
            i++;
        }
    }

    public void calcularInventario () {
        double total = 0;
        for (Producto producto : this.lista) {
            total += producto.getPrecio()*producto.getCantidad();
        }
        System.out.println("El inventario total es: "+total+"€");
    }
}
