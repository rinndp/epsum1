package epsum.curso.accd.inventario.clases;

public class Producto {
    String id;
    String nombre;
    int cantidad;
    double precio;

    public Producto () {}

    public Producto(String id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DATOS PRODUCTO: "+id+"\nNombre: "+nombre+"\nCantidad: "+cantidad+" uds\nPrecio: "+precio+"€\n";
    }
}
