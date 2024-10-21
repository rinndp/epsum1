package epsum.curso.accd.zoologico.clases;

import epsum.curso.accd.zoologico.interfaces.Gestionable;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    ArrayList<Gestionable> datosZoologico = new ArrayList<>();

    public Zoologico() {}

    public Zoologico(ArrayList<Gestionable> datosZoologico) {
        this.datosZoologico = datosZoologico;
    }

    public ArrayList<Gestionable> getDatosZoologico() {
        return datosZoologico;
    }

    public void setAnimales(ArrayList<Gestionable> datosZoologico) {
        this.datosZoologico = datosZoologico;
    }

    public void agregarInfo() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("¿Desea añadir un MAMÍFERO o AVE o CUIDADOR? (M/A/C)?");
            String respuestaTipo = sc.next();

            if (respuestaTipo.equalsIgnoreCase("M")) {
                Mamifero mamifero = new Mamifero();
                System.out.println("Introudzca el NOMBRE:");
                mamifero.setNombre(sc.next());
                System.out.println("Introduzca la EDAD:");
                mamifero.setEdad(sc.nextInt());
                System.out.println("¿Tiene pelo? (S/N)");
                String respuestaPelo = sc.next();

                if (respuestaPelo.equalsIgnoreCase("S")) {
                    mamifero.setPelo(true);
                } else if (respuestaPelo.equalsIgnoreCase("N")) {
                    mamifero.setPelo(false);
                }
                datosZoologico.add(mamifero);
            } else if (respuestaTipo.equalsIgnoreCase("A")) {
                Ave ave = new Ave();
                System.out.println("Introduzca el NOMBRE:");
                ave.setNombre(sc.next());
                System.out.println("Introduzca la EDAD:");
                ave.setEdad(sc.nextInt());
                System.out.println("¿Puede volar? (S/N)");
                String respuestaVolar = sc.next();

                if (respuestaVolar.equalsIgnoreCase("S")) {
                    ave.setPuedeVolar(true);
                } else if (respuestaVolar.equalsIgnoreCase("N")) {
                    ave.setPuedeVolar(false);
                }
                datosZoologico.add(ave);
            } else if (respuestaTipo.equalsIgnoreCase("C")) {
                Cuidador cuidador = new Cuidador();
                System.out.println("Introduzca el NOMBRE:");
                cuidador.setNombre(sc.next());
                System.out.println("Introduzca el AREA:");
                cuidador.setArea(sc.next());

                datosZoologico.add(cuidador);
            }

            System.out.println("Desea añadir otro? (S/N)");
            String respuestaContinuar = sc.next();

            if (respuestaContinuar.equalsIgnoreCase("S")) {
                salir = false;
            } else if (respuestaContinuar.equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }

    public void mostrarDatosZoo () {
        for (Gestionable gestionable : datosZoologico) {
            System.out.println(gestionable);
        }
    }

    public void serializar () {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\zoologico\\zoologico.ser");

        try (FileOutputStream fileOutputStream = new FileOutputStream(archivo);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(datosZoologico);
            System.out.println("La lista de objetos se ha SERIALIZADO CORRECTAMENTE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deserializar () {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\zoologico\\zoologico.ser");

        try (FileInputStream fileInputStream = new FileInputStream(archivo);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            ArrayList <Gestionable> datosZoologico;
            datosZoologico = (ArrayList<Gestionable>) objectInputStream.readObject();
            System.out.println("La lista de objetos se ha DESERIALIZADO:\n");

            for (Gestionable gestionable : datosZoologico) {
                System.out.println(gestionable);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
