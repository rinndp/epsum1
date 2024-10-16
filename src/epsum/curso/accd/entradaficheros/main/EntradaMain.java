package epsum.curso.accd.entradaficheros.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EntradaMain {
    public static void main(String[] args) {
        readFileAndWriteFile();
    }

    public static void readFileAndWriteFile () {
        File readFile = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\entradaficheros\\entrada.txt");
        File writeFile = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\entradaficheros\\salida.bin");
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            if (readFile.exists()) {
                fis = new FileInputStream(readFile);
                fos = new FileOutputStream(writeFile);
                long fileSize = readFile.length();
                byte[] content = new byte[(int) fileSize];

                fis.read(content);
                fos.write(content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
