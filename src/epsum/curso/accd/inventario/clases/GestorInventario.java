package epsum.curso.accd.inventario.clases;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {
    ArrayList <Producto> productos = new ArrayList();

    public GestorInventario() {}

    public GestorInventario(ArrayList <Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void obtenerInformacionArchivo() {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\inventario\\datos_tienda.txt");
        if (archivo.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
                String linea;
                String delimitador = ",";

                while ((linea = bufferedReader.readLine()) != null) {
                    String[] atributoProducto = linea.split(delimitador);

                    Producto producto = new Producto();
                    producto.setId(atributoProducto[0]);
                    producto.setNombre(atributoProducto[1]);
                    producto.setCantidad(Integer.parseInt(atributoProducto[2]));
                    producto.setPrecio(Double.parseDouble(atributoProducto[3]));


                    this.productos.add(producto);

                }
                    System.out.println("SE HA LEIDO LA INFORMACIÓN");
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.err.println("Archivo no encontrado");
        }
    }

    public void agregarProducto() {
        Scanner scanner = new Scanner(System.in);
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\inventario\\datos_tienda.txt");
        boolean salir = false;
        do {
            System.out.println("¿Desea añadir un producto? (S/N)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("S")) {
                Producto producto = new Producto();
                System.out.println("Ingrese el id: ");
                producto.setId(scanner.next());
                System.out.println("Ingrese el nombre: ");
                producto.setNombre(scanner.next());
                System.out.println("Ingrese la cantidad: ");
                producto.setCantidad(Integer.parseInt(scanner.next()));
                System.out.println("Ingrese el precio: ");
                producto.setPrecio(Double.parseDouble(scanner.next()));
                productos.add(producto);

                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter(archivo.getAbsoluteFile(), true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    String datosProducto = producto.id+","+producto.getNombre()+","+producto.getCantidad()+","+producto.getPrecio();
                    bufferedWriter.newLine();
                    bufferedWriter.write(datosProducto);
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (respuesta.equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }




}
