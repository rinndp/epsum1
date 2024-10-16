package epsum.curso.accd.filemanager.main;

import java.io.*;

public class TrabajandoConFciheros {
    public static void main(String[] args) {

        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\filemanager\\info-figuras.txt");

        if (isExists(archivo)) {
            long sizeBits = getBits(archivo.length());

            System.out.println("Tamaño en Bits: " + sizeBits);
            readFileInputStream();
            System.out.println("------------------------");
            readFileAndGetSize();
            System.out.println("------------------------");
            writeFileOutputStream();


        }

    }

    public static boolean isExists (File archivo) {
        return archivo.exists();
    }

    public static long getBits(long archivoLength) {
        return archivoLength * 8;
    }

    public static void readFileInputStream () {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\filemanager\\info-figuras.txt");

            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileAndGetSize () {
        FileInputStream fis = null;

        try {
            File archivo = new File ("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\filemanager\\info-figuras.txt");
            if (isExists(archivo)) {
                fis = new FileInputStream(archivo);
                long sizeFile = archivo.length(); //Tamaño en bytes
                byte [] contenido = new byte[(int) sizeFile]; //Array con todos los bytes

                fis.read(contenido); //Lemmos el contenido en bytes
                System.out.print(new String(contenido)); //Imprimimos el contenido
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFileOutputStream () {
        FileOutputStream fos = null;
        File archivo = new File("C:\\Users\\ALUMNO\\IdeaProjects\\epsum-java\\src\\epsum\\curso\\accd\\filemanager\\exampleFileOutptStream.txt");

        try {
            fos = new FileOutputStream(archivo);
            String contenido = "Hola mundo";

            byte[] contenidoByte = contenido.getBytes(); //Convertimos el String a un array de Bytes
            fos.write(contenidoByte); //Escribimos el contenido

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
