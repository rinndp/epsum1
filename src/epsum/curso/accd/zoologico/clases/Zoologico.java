package epsum.curso.accd.zoologico.clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    ArrayList<Animal> animales = new ArrayList<>();

    public Zoologico() {}

    public Zoologico(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void agregarAnimal() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("¿Desea añadir un MAMÍFERO o AVE? (M/A)?");
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
                animales.add(mamifero);
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
                animales.add(ave);
            }

            System.out.println("Desea añadir otro ANIMAL? (S/N)");
            String respuestaContinuar = sc.next();

            if (respuestaContinuar.equalsIgnoreCase("S")) {
                salir = false;
            } else if (respuestaContinuar.equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }

    public void serializar () {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\zoologico\\zoologico.ser");

        try (FileOutputStream fileOutputStream = new FileOutputStream(archivo);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(animales);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deserializar () {
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\zoologico\\zoologico.ser");

        try (FileInputStream fileInputStream = new FileInputStream(archivo);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            ArrayList <Animal> animales = new ArrayList<>();
            animales = (ArrayList<Animal>) objectInputStream.readObject();

            for (Animal animal : animales) {
                System.out.println(animal);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
