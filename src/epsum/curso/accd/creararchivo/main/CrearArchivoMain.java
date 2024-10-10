package epsum.curso.accd.creararchivo.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CrearArchivoMain {
    public static void main(String[] args) {

        try {
            File fichero = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\creararchivo\\archivoVocales.txt");
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String primeraLinea = bufferedReader.readLine();
            int contadorVocales = 0;
            for (int i = 0; i < primeraLinea.length(); i++) {
                if (primeraLinea.charAt(i) == 'a' || primeraLinea.charAt(i) == 'e' || primeraLinea.charAt(i) == 'i' || primeraLinea.charAt(i) == 'o'
                        || primeraLinea.charAt(i) == 'u' || primeraLinea.charAt(i) == 'A' || primeraLinea.charAt(i) == 'E' || primeraLinea.charAt(i) == 'I'
                        || primeraLinea.charAt(i) == 'O'|| primeraLinea.charAt(i) == 'U') {

                    contadorVocales++;
                }
            }

            System.out.println("Numero de vocales " + contadorVocales);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
