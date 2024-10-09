package epsum.curso.accd.dispositivos.main;

import epsum.curso.accd.dispositivos.clases.Tablet;
import epsum.curso.accd.dispositivos.clases.TelefonoInteligente;

import java.io.*;
import java.util.ArrayList;

public class DispositivoMain {
    public static void main(String[] args) {
        TelefonoInteligente telefonoInteligente = new TelefonoInteligente();
        Tablet tablet = new Tablet();

        telefonoInteligente.encender();
        tablet.encender();
        System.out.println("-------------------------------------------------");
        telefonoInteligente.conectarWifi();
        tablet.conectarWifi();
        System.out.println("-------------------------------------------------");
        telefonoInteligente.desconectarWifi();
        tablet.desconectarWifi();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        telefonoInteligente.setMarca();
        System.out.println(telefonoInteligente.toString());
        System.out.println("-------------------------------------------------");
        ArrayList <String> marcasTelefono = new ArrayList<>();
        File archivoMarcas = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum1\\src\\epsum\\curso\\accd\\cuentabancaria\\mis-dispositivos.txt");

        try {
            FileReader fileReader = new FileReader(archivoMarcas);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                marcasTelefono.add(linea);
            }

            bufferedReader.close();

            for (String marca : marcasTelefono) {
                System.out.println(marca);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
