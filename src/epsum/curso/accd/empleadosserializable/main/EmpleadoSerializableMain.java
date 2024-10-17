package epsum.curso.accd.empleadosserializable.main;

import epsum.curso.accd.empleadosserializable.clases.Empleado;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoSerializableMain {


    public static void main(String[] args) {
        serializar();
        deserializar();
    }
    public static void serializar() {
        Scanner sc = new Scanner(System.in);
        ArrayList <Empleado> empleados = new ArrayList();
        String respuesta;
        boolean salir = false;

        do {
            System.out.println("¿Desea añadir un EMPLEADO? (S/N)");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("S")) {
                Empleado empleado = new Empleado();
                System.out.println("Introduce el NOMBRE:");
                empleado.setNombre(sc.nextLine());
                System.out.println("Introduce la EDAD:");
                empleado.setEdad(sc.nextInt());
                System.out.println("Introduce el SALARIO:");
                empleado.setSalario(sc.nextDouble());

                empleados.add(empleado);

            } else if (respuesta.equalsIgnoreCase("N")) {
                salir = true;
                System.out.println("LA LISTA SE HA SERIALIZADO\n");
            }
        } while (!salir);

        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\empleadosserializable\\empleado.ser");
        try (FileOutputStream fileOutputStream = new FileOutputStream(archivo);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(empleados);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializar() {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\empleadosserializable\\empleado.ser");

        try (FileInputStream fileInputStream = new FileInputStream(archivo);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            ArrayList <Empleado> empleados;
            empleados = (ArrayList<Empleado>) objectInputStream.readObject();

            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
